//Generating simple Calculator
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operator [+,-,*,/] : ");
        char op = sc.next().charAt(0);


        int res = calculate(num1,num2,op);

        System.out.println(num1+""+op+""+num2+"="+res);
    }
    static int calculate(int a,int b, char operator){
        int res=0;
        switch (operator){
            case '+':
                res = a+b;
                break;
            case '-':
                res = a-b;
                break;
            case '*' :
                res = a*b;
                break;
            case '/':
                res=a/b;
                break;
            default :
                System.out.println("Invalid Operator");
        }
        return res;
    }

}
