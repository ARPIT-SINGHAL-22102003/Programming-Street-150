import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = s.nextInt();
        int count = 0;

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                count += 1;
            }
        }

        if(count > 0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    
}
