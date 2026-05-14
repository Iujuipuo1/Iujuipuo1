import webbrowser
import os

with open("hello.html","w") as file:
    file.write("<html>\n")
    file.write("<body>\n")
    file.write("<p> AI is changing the world dramatically</p>\n")
    file.write("<p> Do you think programmers will be needed more or less? </p>\n")
    file.write("</body>\n")
    file.write("</html\n")
               
file = open("hello.html","r")

all_lines = file.readlines()
for line in all_lines:
        print(line.strip()) # .strip() removes leading/trailing whitespace, including newline characters
        