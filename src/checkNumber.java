import java.util.Scanner;

public class checkNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");

        int userInput = input.nextInt();
      // System.out.println(isPrime(userInput));
       /// isPrime(10);

    }

/*
    public static void isPrime(int num) {

        int returnVal ;

        for (int n = 1; n <=num; n++) {

            boolean isPrime = true;
            if (n == 1) {
                isPrime = false;
               // returnVal = System.out.println(n + " is prime number");
            } else if (n == 2 || n == 3) {
                isPrime = true;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }*/
    }

