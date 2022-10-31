package base;

public class splitFunc {
    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
    }

    public static String[] stringToArray(String s) {
        String[] result = s.split(" ");
        System.out.println("s = " + result[2]);
        return result;
    }
}

