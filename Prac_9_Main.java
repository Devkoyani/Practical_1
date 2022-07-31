import java.util.Scanner;
public class Prac_9_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given Sudoku Solution :");
        int arr1[][] = new int[9][9];
        int arr2[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr1[i][j] = sc.nextInt();
                arr2[j][i] = arr1[i][j];
            }
        }
        Prac_9 obj3 = new Prac_9();
        obj3.Sudoku(arr1, arr2);
    }
}