import java.util.*;
class multiplicationtable {
    public class void printmultiplicationtable(int number){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i"="+n*i);
        }
    }
    public static void main(String s[]){
        printmultiplicationtable(5);
        

    }
}
