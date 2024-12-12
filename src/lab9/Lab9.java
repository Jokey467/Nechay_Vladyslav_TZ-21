package lab9;

public class Lab9 {

    public static int hexStringToInt(String s) {
        return Integer.parseInt(s, 16);
    }

    public static int countWordsInString(String s) {
        String[] words = s.split(" ");
        return words.length;
    }
}
