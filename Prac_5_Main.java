import java.util.Scanner;
public class Prac_5_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String a = sc.nextLine();
        System.out.print("Enter Second String : ");
        String b = sc.nextLine();
        Prac_5 obj = new Prac_5();
        int c = obj.stringMatch(a, b);
        System.out.println(c);
    }
}
