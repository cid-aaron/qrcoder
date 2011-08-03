import messages_pb2 as m
import zmq

def encode(data, size=150):
    request = m.QREncodeRequest()
    request.data = data
    request.size = size

    context = zmq.Context()
    socket = context.socket(zmq.REQ)
    socket.connect("tcp://localhost:5555")
    socket.send(request.SerializeToString())
    response = m.QREncodeResponse()
    response.ParseFromString(socket.recv())
    if response.successful:
        return response.qr_code
    else:
        raise Exception()

def decode(image):
    request = m.QRDecodeRequest()
    request.image = image

    context = zmq.Context()
    socket = context.socket(zmq.REQ)
    socket.connect("tcp://localhost:5556")
    socket.send(request.SerializeToString())
    response = m.QRDecodeResponse()
    response.ParseFromString(socket.recv())
    if response.successful:
        return response.data
    else:
        raise Exception()
