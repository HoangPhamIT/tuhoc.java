import java.util.Scanner;

public class bai26_charjava {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);
        char ch3;
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 ky tu: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ky tu vua nhap la: "+ch4);*/
        System.out.println(Character.compare('b','b'));
        System.out.println(Character.compare('a','b'));
        System.out.println(Character.compare('A','a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';

        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}



