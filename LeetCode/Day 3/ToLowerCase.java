

import java.util.*;

class ToLowerCase {


    static String toLowerCase(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {

                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println( toLowerCase(str));
    }
}