public class MissingNumFromAnArray {
    public static void main(String[] args) {
        int num[] = { 11, 12, 14, 15, 16 };
        int missingNum=missingNum(num,5);
        System.out.println(missingNum);
    }

    public static int missingNum(int[] a, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;     }
}
