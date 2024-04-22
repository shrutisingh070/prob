public class patterns {
    public static void main(String args[]){
        int n=4;
        //for(int line=1;line<=4;line++){
          //  for(int stars=1;stars<=n-line+1; stars++){
            //    System.out.print("*");
            //}
            //System.out.println();
        //}
        /**for(int line=1;line<=4;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }*/
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;     
            }
            System.out.println();
        }


    }
}
