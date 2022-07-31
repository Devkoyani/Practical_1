public class Prac_7 {
    static void Pyramid(int row) {
        int num = 0;
        for (int i = 0; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.printf("%4s", " ");
            }
            for (int j = 0; j <= i; j++) {
                num = (int) Math.pow(2, j);
                System.out.printf("%4d", num);
            }
            for (int j = i - 1; j >= 0; j--) {
                num = (int) Math.pow(2, j);
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
