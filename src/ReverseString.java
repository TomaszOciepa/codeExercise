//Write a method that reverses a string.
//For example, 'java interview' becomes 'weivretni avaj'.

public class ReverseString {

    public String reverse(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
