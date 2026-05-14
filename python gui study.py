import tkinter as tk
from tkinter import ttk

def button_click():
    """Function to be called when the button is clicked."""
    print("Button clicked!")
    label.config(text="Hello, Tkinter!")

# Create the main window
root = tk.Tk()
root.title("Simple Tkinter GUI")  # Set the window title
root.geometry("400x250")  # Set the window dimensions (width x height)

# Create a label widget
label = ttk.Label(root, text="Welcome to the simple GUI!")
label.pack(pady=20)  # Add padding around the label

# Create a button widget
button = ttk.Button(root, text="Click Me", command=button_click)
button.pack(pady=10) # Add padding around the button

# Start the Tkinter event loop
root.mainloop()