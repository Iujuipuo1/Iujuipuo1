unit = input("Is this temperature in celcius or Fahrenheit: (C/F)")

temp = float(input("The temperature is: "))

if unit == "C":
    temp = (temp * 9/5) + 32
    print(f"The temperature in Fahrenheit is: {temp}F")
elif unit == "F":
    temp = (temp - 32) * 5/9
else:
    print(f"{unit} is invalid . Please enter C or F")
