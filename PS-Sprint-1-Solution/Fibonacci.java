import java.util.*;

class Fibonacci{
    public static void Series(int x){
        int n1 = 0, n2 = 1;
        for(int i = 0; i < x; i++){
            System.out.println(n1+" ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            if(n1 > x){
                break;
            }
        }
    }
    public static void main(String[] args){
        Series(10);
    }
}