package RecursionBasics;

public class String_Palindrome {

    public static void main(String[] args) {
        String name = "MADAMM";

        if (f(0, name.length() - 1, name)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        if(f1(0, name)){
            System.out.println("It is a Palindrome String");
        }
        else{
            System.out.println("It is Not a Palindrome");
        }
    }

    // Striver Method
    public static boolean f1(int start, String s) {
        if (start >= s.length() / 2) {
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(start))){
            return f1(start + 1, s);
        }
        if(!Character.isLetterOrDigit(s.charAt(s.length() - start - 1))){
            return f1(start, s);
        }


        if (s.charAt(start) != s.charAt(s.length() - start - 1)) {
            return false;
        }
        return f1(start + 1, s);
    }

    // two pointer method
    public static boolean f(int start, int end, String name) {

        if (start >= end) {
            return true;
        }

        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }

        return f(start + 1, end - 1, name);
    }

}
