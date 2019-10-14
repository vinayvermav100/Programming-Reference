import java.util.Scanner;

//A program in java to calculate the nth fibonacci number
public class Fibonacci {

    public static int calculateFibonacci(int n) { //Recursively calculates fibonacci
        if(n == 1) 
            return 1;
        else if(n <1)
            return 0;
        else   
            return calculateFibonacci(n-1) + calculateFibonacci(n-2); //the previous two numbers are added to get the current fibonacci number
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Fibonacci you'd like to calculate: " ); //A user is asked what nth value they'd like to calculate and it is displayed
        int n = in.nextInt();

        System.out.println(calculateFibonacci(n));

        in.close();
    }
}
