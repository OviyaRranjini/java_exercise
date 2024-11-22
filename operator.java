import java.util.Scanner;
public class operator {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number : ");
       int num1=sc.nextInt();
       System.out.println("Enter the second number : ");
       int num2=sc.nextInt();
       System.out.println("Arithemetic Operators : ");
       System.out.println("Addition : "+(num1+num2));
       System.out.println("Subtraction : "+(num1-num2));
       System.out.println("Multiple : "+(num1*num2));
       System.out.println("Division : "+(num1/num2));
       System.out.println("Remainder : "+(num1%num2));
       System.out.println("Unary Operators : ");
       System.out.println("The plus or minus take the symbols with the value :");
       int Value;
       Value =+1;//Unary plus 1 
       System.out.println("Unary plus : "+(Value));
       Value =-1;//Unary minus 1
       System.out.println("Unary minus : "+(Value));
       System.out.println("Unary Increment : "+(++Value));
       System.out.println("Unary Decrement : "+(--Value));
       System.out.println("Unary Not : "+(!true));
       System.out.println("Assignment Operator : ");
       System.out.println("Simple assign : = ");
       System.out.println("Compound assignment : symbol  = ");
       System.out.println("Relational Operator : ");
       System.out.println("Equal to : "+(num1==num2));
       System.out.println("Not Equal to : "+(num1!=num2));
       System.out.println("Greater than : "+(num1>num2));
       System.out.println("Greater than or equal : "+(num1>=num2));
       System.out.println("Less than : "+(num1<num2));
       System.out.println("less than or equal : "+(num1<=num2));
       System.out.println("Logical Operator : ");
       System.out.println("Logical AND : "+(num1>0&&num2>0));
       System.out.println("Logical OR : "+(num1>0||num2>0));
       System.out.println("Logical NOT : "+(num1!=0));
       System.out.println("Bitwise Operator : ");
       System.out.println("Bitwise AND : "+(num1&num2));
       System.out.println("Bitwise OR : "+(num1|num2));
       System.out.println("Bitwise XOR : "+(num1^num2));
       System.out.println("Bitwise complement : "+(~num1));
       System.out.println("Left Shift : "+(num2<<2));
       System.out.println("Right Shift : "+(num2>>2));
       System.out.println("Trinary condition or operator : ");
       System.out.println("Number one is "+(num1>=num2?"Greater than or equal ":"less than ")+"to the number two");
       System.out.println("Instanceof Operator : ");
       System.out.println("Type cast Operator : ");
       sc.close();
   } 
}
