import os 

file_size= {
    "100MB":100* 1024* 1024,
    "500MB":500* 1024* 1024,
    "1GB" : 1024* 1024* 1024,
}

for name, size in file_size.items():
    file_name = f"test_{name}.bin"

    with open(file_name, "wb") as f:
        f.write(os.urandom(size))
    
    print(f"{file_name} Created ")
