package com.cid.qrcoder

import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import java.io.ByteArrayInputStream
import com.google.zxing._
import com.google.zxing.common.{HybridBinarizer}
import com.google.zxing.client.j2se.{BufferedImageLuminanceSource}
import com.google.zxing.qrcode._
import org.zeromq.ZMQ
import org.zeromq.ZMQ.{Context, Socket}

import QRCoderProtos.{QRDecodeRequest, QRDecodeResponse}

object Decoder {
  def main(args: Array[String]) {
    val context = ZMQ.context(1)
    val socket = context.socket(ZMQ.REP)
    socket.bind("tcp://*:5556")

    while (true) {
      val request = QRDecodeRequest.parseFrom(socket.recv(0))

      val image = ImageIO.read(
        new ByteArrayInputStream(request.getImage().toByteArray()))
      val source = new BufferedImageLuminanceSource(image)
      val bitmap = new BinaryBitmap(new HybridBinarizer(source));

      val reader = new QRCodeReader()
      val result = reader.decode(bitmap)

      val response = QRDecodeResponse.newBuilder()
        .setSuccessful(true)
        .setData(result.getText())
        .build()

      socket.send(response.toByteArray(), 0)
    }
  }
}
