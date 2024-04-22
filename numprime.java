import java.util.*;
public class numprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){//FOR OPTIMISATION USE ROOT N BECAUSE IT IS BETTER FROM N-1 TO WRITE
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime=true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
    }
}
