import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Input_output {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Integer: ");
    int n = sc.nextInt();
    System.out.println("Display Integer : "+n);
    System.out.print("Enter the Character: ");
    char c = sc.next().charAt(0);
    System.out.println("Display Character : "+c);
    System.out.print("Enter the Double: ");
    double d = sc.nextDouble();
    sc.nextLine();
    System.out.println("Display Double : "+d);
    System.out.print("Enter the String: ");
    String s = sc.nextLine();
    System.out.println("Display the string : "+s);
    System.out.println("Display the every single character in string : ");
    for(int i=0;i<s.length();i++){
        System.out.print(s.charAt(i)+" ");
    }
    System.out.println();
    System.out.print("Enter 5 integers for the Array: ");
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Display the array : ");
    for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("Enter 5 Characters for the Char Array: ");
        char[] charArr = new char[5];
        for (int i = 0; i < 5; i++) {
            charArr[i] = sc.next().charAt(0); 
        }
        System.out.println("Display the Character array : ");
        for(int i=0;i<5;i++){
            System.out.print(charArr[i]+" ");
        }
        System.out.println();
    System.out.print("Enter 5 integers for the ArrayList: ");
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
        l.add(sc.nextInt());
    }
    System.out.println("Display the List : "+l);
    sc.close();
}
}
