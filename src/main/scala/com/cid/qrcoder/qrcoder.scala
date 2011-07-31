package com.cid.qrcoder

import javax.imageio._
import java.io._
import com.google.zxing._
import com.google.zxing.client.j2se._
import com.google.zxing.qrcode._
import net.liftweb.json._
import net.liftweb.json.JsonDSL._
import org.zeromq.ZMQ
import org.zeromq.ZMQ.{Context,Socket}

import QRCoderProtos.QREncodeRequest

case class Options(data: String, size: Int)

object Encoder {
  def main(args: Array[String]) {
    println(args(0))
    implicit val formats = DefaultFormats
    val opts = parse(args(0)).extract[Options]
    val req = QREncodeRequest.newBuilder().setData(opts.data).setSize(opts.size).build()
    println(req.toString)
    val writer = new QRCodeWriter()
    val code = writer.encode(opts.data, BarcodeFormat.QR_CODE, opts.size, opts.size)
    val bi = MatrixToImageWriter.toBufferedImage(code)
    ImageIO.write(bi, "png", new File("c:/cid/data/qr.png"))
  }
}
