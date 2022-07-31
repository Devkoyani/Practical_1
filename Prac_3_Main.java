import java.util.Scanner;
public class Prac_3_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        Prac_3 obj = new Prac_3();
        boolean c = obj.lastDigit(a, b);
        System.out.println(c);
    }
}
