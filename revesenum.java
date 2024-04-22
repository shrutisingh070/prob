public class revesenum{
    public static void main(String args[]){
        int numb=12387;
        while(numb>0){
            int lastdigit=numb%10;
            System.out.print(lastdigit+ " ");
            numb=numb/10;
        }
        System.out.println();
    }
}