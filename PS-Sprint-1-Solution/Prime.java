import java.util.*;

public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1){
             System.out.println("Not Prime");
        } // 0 and 1 are not prime
        if (num == 2){
             System.out.println("Prime");
        }  // 2 is prime
        if (num % 2 == 0){
             System.out.println("Not Prime");
            }// even numbers > 2 are not prime

        // Check divisors up to √num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0){
                System.out.println("Not Prime");
            };
        }
        System.out.println( "Prime");
    }
}