import java.util.*;
public class example {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int income=s.nextInt();
        int tax=0;
        if(income<500000){
            tax=0;
        }else if(income>=500000 && income<1000000){
            tax=(int)(income*0.2);
        }else{
            tax=(int)(income*0.3);
        }
        System.out.println("your tax is:"+tax);
    }
}
