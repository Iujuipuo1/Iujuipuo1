temp = float(input("Enter the temperature"))

is_sunny = True

if temp >= 28 and is_sunny:
    print("It is hot and sunny outside")
elif temp <= 0 and is_sunny:
    print("Is cold and sunny outside ")
elif 28 > temp > 0 and is_sunny:
    print("It is warm outside")