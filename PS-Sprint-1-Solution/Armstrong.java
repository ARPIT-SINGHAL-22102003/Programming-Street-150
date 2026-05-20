import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orgNum = num;
        int p = String.valueOf(num).length();
        int sum = 0;
        while(num > 0){
            int r = num%10;
            sum += Math.pow(r,p);
            num = num/10;
        }

        if(sum == orgNum){
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not an Armstrong Number");
        }
    }
}