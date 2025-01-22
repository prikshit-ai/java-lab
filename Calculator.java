
class Calculator {

    UserInput in = new UserInput(); // Create a single instance of UserInput

    // Addition method
    int addition() {
        int[] num = in.inputTwoNumbers(); 
        return num[0] + num[1];
    }

    // Multiplication method
    int multiplication() {
        int[] num = in.inputTwoNumbers(); 
        return num[0] * num[1];
    }

    // Division method
    int division() {
        int[] num = in.inputTwoNumbers(); 
        if (num[1] == 0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        }
        return num[0] / num[1];
    }

    // Subtraction method
    int subtraction() {
        int[] num = in.inputTwoNumbers(); 
        return num[0] - num[1];
    }

    // Fibonacci series method
    void fibonacci() {
        int count = in.inputFibonacciCount(); 
        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");
        System.out.print(a);

        if (count > 1) {
            System.out.print(" " + b);
        }

        for (int i = 2; i < count; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(" " + b);
        }
        System.out.println(); // End the line after printing the series
    }

    // Calculate the average and variance of an array
    void calculateAverage() {
        int sum = 0 ;
        int varianceSum = 0;
        int[] array = in.inputArrayAndCalculateAverage(); 
        for (int i = 0; i < array.length; i++) {
            
            sum += array[i];
        }
        int average = sum/array.length;
        for (int i = 0; i < array.length; i++) {
             varianceSum += Math.pow(array[i] - average, 2); // Sum of squared differences from the mean
        }

        System.out.println("The average is: " + average);
        System.out.println("The variance is: " + varianceSum);

    }

}
