n = int(input("Enter a natral number: "))
i = 2

print("Prime numbers of", n, "are: ")

while n > 1:
    if n % i ==0:
        print(i, end=" ")
        n = n // i
    else:
        i += 1