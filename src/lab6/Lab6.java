package lab6;

public class Lab6 {

    public static int hexStringToInt(String s) {
        return Integer.parseInt(s, 16);
    }

    public static int countWordsInString(String s) {
        String[] words = s.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(hexStringToInt("15"));
        System.out.println(countWordsInString("laba nomer shist"));
    }
}
