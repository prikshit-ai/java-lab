import java.util.Scanner;

class UserInput {

    // Method to take two numbers as input
    int[] inputTwoNumbers() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        numbers[0] = scan.nextInt();

        System.out.println("Enter 2nd Number: ");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    // Method to take input for the number of Fibonacci digits
    int inputFibonacciCount() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many digits of Fibonacci you want: ");
        return scan.nextInt();
    }

    // Method to take an array as input and calculate the average
    double inputArrayAndCalculateAverage() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements: ");
        int sum = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            sum += array[i];
        }

        return (double) sum / size; // Return the average
    }
}
