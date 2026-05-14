
import socket

target_host = "hurl.it"
target_port = 80;

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

client.connect((target_host, target_port))

client.send("GET / HTTP/1.1\r\nHost: hurl.it\r\n\r\n".encode())

response = client.recv(40960)
print(response.decode())