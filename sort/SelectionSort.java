import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (a[m] > a[j]) {
                    m = j;
                }
            }
            int t = a[m];
            a[m] = a[i];
            a[i] = t;
        }
        System.out.print("After Selection Sort: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
