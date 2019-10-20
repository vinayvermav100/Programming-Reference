import java.util.Scanner;
public class AnagramChecker {

    public static String flipString(String str) { //Simple method to return a string that is the reverse of the input
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) { //iterates over string backwards and appends characters to a new string
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    public static boolean checkForAnagram(String str1, String str2) { //Method to check if the two strings are anagrams
        if(str1.equals(flipString(str2)))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first string: " );
        String str1 = in.next();
        System.out.println("Enter your second string: " );
        String str2 = in.next();
        System.out.println(checkForAnagram(str1,str2)? "The Strings are anagrams" : "The Strings aren't anagrams");

        in.close();
    }
}