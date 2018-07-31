package eleks_academy_java.loops;


public class Palindrome {

    public static void main(String[] args) {

        System.out.println(istPalindrome("abccba"));
    }

    public static boolean istPalindrome(String text){

        char [] word = text.toLowerCase().toCharArray();

        int i1 = 0;
        int i2 = word.length - 1;

        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
