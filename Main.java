import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner cf = new Scanner(System.in);
        
        int ans = 0 ;
        int ch = 0;
        do{
            
            System.out.println("what do u want to do :1) + \n 2) - \n 3) % \n 4) * \n 5) / \n 6) Press f for Fibonacci series \n 7)Press g for average\n 8) press x to exit \n");
            char choice = cf.next().trim().charAt(0);
            if(choice == '+' ||choice == '-' ||choice == '*' ||choice == '/' ||choice == '%'|| choice =='f'|| choice=='g' ){
                
                if(choice == '+'){
                    System.out.println("Sum is: " + cal.addition());
                }
                if(choice == '-'){
                    System.out.println("Sum is: " + cal.subtraction());
                }
                if(choice == '/'){
                    System.out.println("Sum is: " + cal.division());
                }
                if(choice == '*'){
                    System.out.println("Sum is: " + cal.multiplication());
                }
                if(choice == 'f'){
                    cal.fibonacci();

                }
                if(choice == 'g'){
                    cal.calculateAverage();
                }
                System.out.println(ans);
            
                }
                else if(choice == 'x'|| choice =='X'){
                    System.out.println("quitting ...");
                    ch = 1 ;
                }
                else{
                    System.out.println("invalid choice");
                }



        

            }while(ch == 0);
    }
}