import java.util.*;

class StringManipulation
{
    
    public static void Check(String s) {
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUaeiou".contains(String.valueOf(s.charAt(i)))) {
                vowel++;
            }
        }
        System.out.println("The number of vowels is: " + vowel);
        System.out.println("The number of consonants is: " + (s.length() - vowel));
    } 

    public static boolean palindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String duplicate(String s) {
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (!st.contains(String.valueOf(s.charAt(i)))) {
                st += s.charAt(i);
            }
        }
        return st;
    }

    public static String nonrepeating(String s) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String for reverse:");
        StringBuilder a = new StringBuilder(sc.next());
        System.out.println("The String is: " + a.toString());
        System.out.println("The reversed String is: " + a.reverse().toString());

        System.out.println("Enter the string to check vowels and consonants:");
        Check(sc.next());

        System.out.println("Enter the String to check palindrome:");
        String p = sc.next();
        if (palindrome(p)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        System.out.println("Enter the String to find duplicate characters:");
        String duplicateString = duplicate(sc.next());
        System.out.println("The string with duplicate characters removed: " + duplicateString);

        System.out.print("Enter the string to find the non-repeating characters: ");
        String nonRepeatingString = nonrepeating(sc.next());
        System.out.println("The non-repeating characters are: " + nonRepeatingString);
    }
}
