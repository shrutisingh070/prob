import java.util.*;
public class diffpossibility {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        char operator=s.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("wrong calculator");
        }
    }
    
}
