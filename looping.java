import java.util.*;

public class looping {
    
    public static void Guess(){
        Scanner sc=new Scanner(System.in);
        int i=1;
        do{
            System.out.println("Enter the guess number (1 - 10) : ");
            int t=(int)Math.random()*10;
            int g=sc.nextInt();
            if(g==t){
                System.out.println("You found it !!");
                break;
            }
            else{
                System.out.println("Try again");
            }
        } while(i!=0);
        sc.close();
        return;
    }
    public static void tables(int n){
        for(int i=0;i<=10;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }
        return;
    }
    public static void reverse(int n){
        while(n!=0){
            System.out.print(n%10);
            n=n/10;
        }
        return;
    }
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
           fact*=i;
        }
        System.out.println(fact);
        return;
    }
    public static void sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("The sum of digits : "+sum);
        return;
    }
    public static String prime(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){return "";}
        }
        return "not a ";
    }
    public static void fibonacci(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++){
            int t=a+b;
            a=b;
            b=t;
            System.out.print(t+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n to find the sum of n natural number " );
        int n=sc.nextInt();
        System.out.println("Sum of n natural number is : "+(n*(n-1))/2);
        System.out.println("Random number : ");
        Guess();
        System.out.println("Enter the value which table did you want : ");
        tables(sc.nextInt());
        System.out.println("Enter the number to reverse : ");
        reverse(sc.nextInt());
        System.out.println("Enter the number for factorial : ");
        factorial(sc.nextInt());
        System.out.println("Enter the number to fing sum of the digit : ");
        sumOfDigit(sc.nextInt());
        System.out.println("Enter the number to print prime or not : ");
        int t=sc.nextInt();
        System.out.println("The given number is "+prime(t)+"prime number");
        System.out.println("Enter the number for Fibonacci Sequence : ");
        fibonacci(sc.nextInt());
        System.out.println("Enter the number to check the armstrong : ");
        int a=sc.nextInt();
       // System.out.print
    }
}
