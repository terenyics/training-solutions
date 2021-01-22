package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        String s = "" + "";
        String z = "Abcde";

        System.out.println(s.length());
        System.out.println(z.length());
        System.out.println(z.charAt(0) + "," + z.charAt(2));
        System.out.println(z.substring(0,3));

    }

}
