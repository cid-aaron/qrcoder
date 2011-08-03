package com.cid.qrcoder

import javax.imageio._
import java.io._
import com.google.zxing._
import com.google.zxing.client.j2se._
import com.google.zxing.qrcode._
import com.google.protobuf.ByteString
import org.zeromq.ZMQ
import org.zeromq.ZMQ.{Context,Socket}

import QRCoderProtos.{QREncodeRequest, QREncodeResponse}

object Encoder {
  def main(args: Array[String]) {
    val context = ZMQ.context(1) // use one thread
    val socket = context.socket(ZMQ.REP)
    socket.bind("tcp://*:5555")

    while (true) {
      // turn the raw byte request into a protobuf object
      val request = QREncodeRequest.parseFrom(socket.recv(0))

      println("Received request:")
      println(request.toString)

      val writer = new QRCodeWriter()
      val code = writer.encode(
        request.getData(), BarcodeFormat.QR_CODE,
        request.getSize(), request.getSize())
      val bi = MatrixToImageWriter.toBufferedImage(code)
      val bytes = new ByteArrayOutputStream()
      ImageIO.write(bi, "png", bytes)

      // turn the image data into a protobuf object
      val response = QREncodeResponse.newBuilder()
        .setSuccessful(true)
        .setQrCode(ByteString.copyFrom(bytes.toByteArray()))
        .build()

      socket.send(response.toByteArray(), 0)
    }
  }
}
