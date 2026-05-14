#Hypotenuse of triangle 
import math


a = float(input("The length of A side in the triangle"))
b = float(input("The length of B side in the triangle"))

x = (a**2) + (b**2)

c = math.sqrt(x)

print(f"The length of hypotenuse is: {round(c)}")