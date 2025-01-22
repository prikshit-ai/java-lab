# Java Calculator and Utility Program

## Overview
This Java program provides a utility application with multiple functionalities, including arithmetic operations, generating a Fibonacci series, and calculating the average of an array. It is designed with modularity and user interaction in mind, using a menu-driven approach.

## Features

1. **Arithmetic Operations:**
   - Addition (`+`)
   - Subtraction (`-`)
   - Multiplication (`*`)
   - Division (`/`)
   - Modulus (`%`)

2. **Fibonacci Series Generation:**
   - Calculate and display the first `n` digits of the Fibonacci sequence.

3. **Array Average Calculation:**
   - Input an array and calculate its average.

4. **Interactive Menu:**
   - Provides a menu to let the user select the desired operation.

5. **Error Handling:**
   - Handles division by zero.
   - Ensures input validity.

## Structure

### Classes

1. **`UserInput`**
   - Handles all user inputs.
     - `inputTwoNumbers()`: Takes two numbers as input.
     - `inputFibonacciCount()`: Takes the number of Fibonacci digits as input.
     - `inputArrayAndCalculateAverage()`: Takes an array as input and calculates its average.

2. **`Calculator`**
   - Implements the core functionalities.
     - `addition()`, `subtraction()`, `multiplication()`, `division()`: Perform arithmetic operations.
     - `fibonacci()`: Generates the Fibonacci sequence.
     - `calculateAverage()`: Calculates the average of an array.

3. **`Main`**
   - The main entry point for the program.
   - Provides a menu-driven interface for user interaction.

## How to Run

1. Compile the program:
   ```bash
   javac Main.java
   ```

2. Run the program:
   ```bash
   java Main
   ```

3. Follow the menu prompts to perform the desired operation.

## Example Usage

### Menu Options

- Press `+` for Addition
- Press `-` for Subtraction
- Press `*` for Multiplication
- Press `/` for Division
- Press `%` for Modulus
- Press `f` for Fibonacci Series
- Press `g` for Average Calculation
- Press `x` to Exit



## Error Handling
- Division by zero is handled gracefully with an error message.
- Prompts are provided for invalid choices in the menu.

## Requirements
- Java Development Kit (JDK) 8 or later.

## Notes
- Ensure that the input provided matches the expected format for each operation.
- Modular design allows for easy extension of functionalities.

## Future Improvements
- Add functionality for additional mathematical operations.
- Allow users to save results to a file.
- Enhance input validation for edge cases.

