// Prikshit gaur
// 23070126094
// AIML B-1


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // Create a Calculator object
        Scanner cf = new Scanner(System.in);
        
        int ans = 0;
        int ch = 0;
        do {
            // Display menu for user choices
            System.out.println("What do you want to do: \n1) + \n2) - \n3) % \n4) * \n5) / \n6) Press f for Fibonacci series \n7) Press g for average and variance  \n8) Press x to exit");
            char choice = cf.next().trim().charAt(0); // Read user's choice

            // Handle valid choices
            if (choice == '+' || choice == '-' || choice == '*' || choice == '/' || choice == '%' || choice == 'f' || choice == 'g') {
                if (choice == '+') {
                    System.out.println("Sum is: " + cal.addition());
                }
                if (choice == '-') {
                    System.out.println("Difference is: " + cal.subtraction());
                }
                if (choice == '/') {
                    System.out.println("Quotient is: " + cal.division());
                }
                if (choice == '*') {
                    System.out.println("Product is: " + cal.multiplication());
                }
                if (choice == 'f') {
                    cal.fibonacci(); // Generate Fibonacci series
                }
                if (choice == 'g') {
                    cal.calculateAverage(); // Calculate average of an array
                }
                System.out.println(ans);

            } else if (choice == 'x' || choice == 'X') {
                // Exit the program
                System.out.println("Quitting...");
                ch = 1;
            } else {
                // Handle invalid input
                System.out.println("Invalid choice");
            }

        } while (ch == 0); // Continue until the user chooses to exit
    }
}

