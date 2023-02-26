import java.lang.Thread.Builder;
import java.util.Arrays;

public class strings_stringbuilder {
    public static void main(String[] args) {
        // String str="Aman";
        // String st="Aman";
        // str="ak";
        // System.out.println(str);
        // System.out.println(st);

        // comparision

        // String a ="Aman";
        // String b="Aman";
        // System.out.println(a==b); //ans true

        // explicitly telling java to create new object outside the stringpool.

        // String a = new String("Aman");
        // String b=new String("Aman");
        // System.out.println(a==b); //ans flase
        // // if you only explicitly check value in string then use .equals() method
        // System.out.println(a .equals(b)); //ans true.

        // Now for finding every character of String

        // String str="Aman";
        // System.out.println(str.charAt(0));
        // System.out.println(str.charAt(1));
        // System.out.println(str.charAt(2));
        // System.out.println(str.charAt(3));

        // operators in string.
        // System.out.println('a'+'b'); // this is charcter not string thats why value
        // will be ASCII.
        // System.out.println("a"+"b");
        // System.out.println((char)('a'+3));
        // System.out.println((char)(100));

        // StringBulider

        // StringBuilder str =new StringBuilder();
        // for(int i=0;i<26;i++){
        // char ch = (char)('a'+i);
        // str.append(ch);
        // }
        // // System.out.println(str);
        // // str.deleteCharAt(25);
        // // System.out.println(str);
        // // str.delete(0, 14);
        // // System.out.println(str);
        // str.reverse();
        // System.out.println(str);

        // strings method

        // String name="Aman kumar";
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.indexOf('a'));

        // String name=" Aman Kumar ";
        // System.out.println(name);
        // System.out.println(name.strip());

        // Q: Find the string is palindrome or not.
        // palindrome means from ryt to left it should be same like "abcdcba"

        String str = "abcdcba";
        System.out.println(palindrome(str));

    }

    static boolean palindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

}
