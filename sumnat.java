import java.util.*;
public class sumnat{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int sum=0;
        int counter=1;
        while(counter<=num){
            sum+=counter;
            counter++;
        }
        System.out.println("sum is"+sum);
    }
    
}
