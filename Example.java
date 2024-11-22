//import java.awt.SystemColor;
import java.util.*;
public class Example{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the integer");
            int n=sc.nextInt();
            String st=sc.nextLine();
            System.out.print("Enter the String:");
            String s=sc.next();
            System.out.print("Enter the Double");
            double d=sc.nextDouble();
            System.out.println("Integer : "+n);
            System.out.println("String : "+st);
            System.out.println("String : "+s);
            System.out.println("Double : "+d);
        }
    }
}