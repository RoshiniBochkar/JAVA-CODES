import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        double a = scan.nextDouble();
        System.out.print("b = ");
        double b = scan.nextDouble();
        System.out.println("Select Operation:");
        System.out.println("Type 1 for Addition");
        System.out.println("Type 2 for Subtraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Division");
        boolean validInput;

        do{
            int n = scan.nextInt();
            validInput = true;

            if(n == 1){
                System.out.println(a+b);
            }
            else if(n == 2){
                System.out.println(a-b);
            }
            else if(n == 3){
                System.out.println(a*b);
            }
            else if(n == 4){
                if(b!=0) {
                    System.out.println(a / b);
                }else{
                    System.out.println("Not divisible by zero");
                    validInput = false;
                }
            }else{
                System.out.println("Choose only among given numbers");
                validInput = false;
            }
        }while(!validInput);
    }
}
