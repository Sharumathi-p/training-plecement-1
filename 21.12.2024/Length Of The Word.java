public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Length of last word in s1: " + lengthOfLastWord(s1));
        System.out.println("Length of last word in s2: " + lengthOfLastWord(s2));
        System.out.println("Length of last word in s3: " + lengthOfLastWord(s3));
    }
}
