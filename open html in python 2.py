str = '''
<html>
    <body>
         <p> AI is changing the world dramatically</p>
         <p> Do you think programmers will be needed more or less? 
    </body>
</html>
'''
f = open ("hello.html","w")
f.write(str)
f.close()


f = open("hello.html","r")
for line in f:
    print(line)
f.close()