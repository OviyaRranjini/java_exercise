import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Integer: ");
        int n = sc.nextInt();
        System.out.println("Integer to Double: " + (double)n);
        System.out.println("Integer to Char: " + (char)n);
        System.out.println("Integer to String: " + Integer.toString(n));

        System.out.print("Enter the Character: ");
        char c = sc.next().charAt(0);
        System.out.println("Character to Integer: " + (int)c);
        System.out.println("Character to Double: " + (double)c);
        System.out.println("Character to String: " + Character.toString(c));

        System.out.print("Enter the Double: ");
        double d = sc.nextDouble();
        System.out.println("Double to Integer: " + (int)d);
        System.out.println("Double to Char: " + (char)((int)d));
        System.out.println("Double to String: " + Double.toString(d));
        System.out.println("Double rounded to 2 decimal places: " + (Math.round(d * 100.0) / 100.0));

        sc.nextLine(); // Consume the newline left-over

        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        try {
            System.out.println("String to Integer: " + Integer.parseInt(s));
            System.out.println("String to Double: " + Double.parseDouble(s));
        } catch (NumberFormatException e) {
            System.out.println("The entered string is not a valid number.");
        }
        if (s.length() > 0) {
            System.out.println("String to Character (first character): " + s.charAt(0));
        }

        System.out.print("String to Character Array: ");
        char[] a = s.toCharArray();
        for (char ch : a) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.print("Enter 5 integers for the Array: ");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> arrayList = new ArrayList<>();
        for (int value : arr) {
            arrayList.add(value);
        }
        System.out.println("Array to ArrayList: " + arrayList);

        System.out.print("Enter 5 Characters for the Char Array: ");
        char[] charArr = new char[5];
        for (int i = 0; i < 5; i++) {
            charArr[i] = sc.next().charAt(0); 
        }
        System.out.println("Character Array to String: " + new String(charArr));

        System.out.print("Enter 5 integers for the ArrayList: ");
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l.add(sc.nextInt());
        }
        Integer[] intArray = l.toArray(new Integer[0]); 
        System.out.println("ArrayList to Array: " + Arrays.toString(intArray));

        sc.close();
    }
}
