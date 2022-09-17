//program to calculate Factorial of the number
import java.util.Scanner;
public class Main {
    public static void factorial(int n) {
        int factorial = 1;
        int i;
       //loop
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
       for (i=n; i>=1; i--) {
            factorial = factorial * i;

        }
        System.out.println("The factorial of the number is " + factorial);
       return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        factorial(n); //calling a function


    }
}