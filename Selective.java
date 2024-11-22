import java.util.Scanner;
public class Selective{
    public static char Grade(int n){
        if(n>=90){return 'A';}
        else if(n>=80&&n<90){return 'B';}
        else if(n>=70&&n<80){return 'C';}
        else if(n>=60&&n<70){return 'D';}
        else {return 'F';}
    }
    public static String findDay(int n){
        if(n>31||n<1){
            return "Date is 1 to 31";
        }
        n=(n%7)+1;
        switch (n) {
           case 1:
            return "Sunday";
            case 2:
            return "Monday";
            case 3:
            return "Tuesday";
            case 4:
            return "Wednesday";
            case 5:
            return "Thursday";
            case 6:
            return "Firday";
            case 7:
            return "Saturday";
        }
        return "Some error chech the input";
    }
    public static String findType(char s){
       if(s>='0'&&s<='9'){
        return "Digit";
       }
       else if((s>='A'&&s<='Z')||(s>='a'&&s<='z')){
        if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            return "Vowels";
        }
        else{
            return "Consonant";
        }
       }
       else{
        return "Special Character";
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Mark : ");
        char g=Grade(sc.nextInt());
        System.out.println("The Grade : "+ g);
        System.out.println("Enter the Date (1 -> Sunday) : ");
        String day= findDay(sc.nextInt());
        System.out.println("The Day is : "+day);
        System.out.println("Enter the number to check it is even or not : ");
        int n=sc.nextInt();
        System.out.println("The given number is :"+(n%2==0?"Even":"Odd"));
        System.out.println("Enter the char to find what is it : ");
        String type = findType(sc.next().charAt(0));
        System.out.println("The type of the character is : "+type);
        sc.close();
    }
}