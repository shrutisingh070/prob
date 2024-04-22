import java.util.*;
public class example1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter ur number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
