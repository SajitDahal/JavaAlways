//check the number is prime or not

import java.util.Scanner;
public class Problem {

    public static void prime(int n){
        int i;
        int c= 0;
        //logic
        for(i=1 ;i<=n; i++){
            if(n%i == 0){
                c++;
            }
        }
        if(c==2){
            System.out.println("It is the prime number.");
        }

        else{
            System.out.println("It is not the Prime number.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        prime(n);


    }
}

