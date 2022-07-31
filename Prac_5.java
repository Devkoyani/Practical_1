public class Prac_5 {
    static int stringMatch(String a, String b) {
        int n = 0;
        int k = Math.min(a.length(), b.length());
        for (int j = 0; j < k - 1; j++) {
            if (a.substring(j, j + 2).equals(b.substring(j, j + 2))) {
                n++;
            }
        }
        return n;
    }
}
