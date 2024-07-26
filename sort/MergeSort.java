import java.util.*;

public class MergeSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergerSort(a);
        System.out.print("After Merge Sort: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        sc.close();
    }

    public static void mergerSort(int a[]) {
        int n = a.length;
        if (n <= 1)return;
        int m = n / 2, j = 0;
        int l[] = new int[m];
        int r[] = new int[n - m];
        for (int i = 0; i < n; i++) {
            if (i < m)
                l[i] = a[i];
            else
                r[j++] = a[i];
        }
        mergerSort(l);
        mergerSort(r);
        merge(l, r, a);
    }

    public static void merge(int left[], int right[], int a[]) {
        int i = 0, l = 0, r = 0;
        while (l < left.length && r < right.length && i < a.length) {
            if (left[l] < right[r]) {
                a[i++] = left[l++];
            } else {
                a[i++] = right[r++];
            }
        }
        while (l < left.length) {
            a[i++] = left[l++];
        }
        while (r < right.length) {
            a[i++] = right[r++];
        }
    }

}
