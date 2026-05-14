import tkinter as tk
from tkinter import ttk 


def button_click():
    print("Button Clicked")
    label.config(text = "Hello")

root = tk.Tk()
root.title("Paopao's GUI")
root.geometry("400x250")


label = ttk.Label(root, text = "Hello")
label.pack(pady = 20)

Button = ttk.Button(root, text = "click me", command = button_click)
Button.pack(pady=10)

root.mainloop()



