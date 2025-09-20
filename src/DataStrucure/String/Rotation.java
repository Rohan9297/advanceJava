package DataStrucure.String;

public class Rotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        boolean value = isRotate(str1, str2);
        System.out.println(value);
    }

    public static boolean isRotate(String s, String goal) {
        StringBuilder str = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i - 1);

            str.append(s.charAt(i));
            if (i == s.length() - 1) {
                str.append(ch);
                System.out.println(ch);

                if (str.equals(goal)) {
                    return true;
                }
            }

        }
        return false;
    }
}
