import java.util.Scanner;

public class Prac_10_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter Message");
        s1 = sc.nextLine();
        Prac_10 obj = new Prac_10();
        obj.Caesar_Cipher(s1);
    }
}