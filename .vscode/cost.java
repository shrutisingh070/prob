import java.util.*;
public class cost{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        float pencil=s.nextFloat();
        float pen=s.nextFloat();
        float eraser=s.nextFloat();
        System.out.println(pencil);
        System.out.println(pen);
        System.out.println(eraser);
        float price=pencil+pen+eraser;
        System.out.println(price);
        float gross = 0.18f*price;
        System.out.println(gross);
        System.out.println(price-gross);
    }
}
