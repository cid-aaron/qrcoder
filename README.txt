# QR Code Encoding & Decoding

Encoding and decoding are handled by two scala objects using
[zxing](http://code.google.com/p/zxing/). Communication with these
objects happens via [0MQ](http://www.zeromq.org/) sockets (using
[protocol buffers](http://code.google.com/apis/protocolbuffers/docs/overview.html)
for the wire format).

There are example clients written in [python](http://www.python.org).

## Requirements

[Scala](http://www.scala-lang.org/downloads)
[SBT](https://github.com/harrah/xsbt/wiki/Setup)

Additionally, the libs jzmq.dll and libzmq.dll need to be somewhere on
your PATH. If it helps: I have a c:\users\aaron\bin directory that's
on my PATH; I stick all sorts of things in there like
[curl](http://curl.haxx.se/), helper scripts, and the sbt.bat &
sbt-launch.jar.

Here's my sbt.bat:

https://gist.github.com/1382ce9e5022c56c8fb0

## Running

Once you have sbt installed, open a console, and cd into server
directory and start sbt (i.e., type "sbt" and hit enter). Once sbt has
started, type "run" and hit enter. From there, it will ask you which
server you want to start: the Encoder or the Decoder. If you wanted
both running, you could open two console windows.

Ctrl-c to stop the server.
