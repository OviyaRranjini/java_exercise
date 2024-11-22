public class pattern{
    public static void main(String args[]){
        int n=5;
        char ch='A';
        ch--;
        for(int i=n;i>0;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            ch+=(n-i+1);
            for(int j=n;j>=i;j--){
                System.out.print(ch);
                ch--;
            }
            ch+=(n-i+1);
            System.out.println();
        }

    }
}