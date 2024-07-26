import java.util.*;

class LinearSearch {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (a[i] == target) {
                    System.out.print("Found at " + i);
                    return;
                }
            }
            System.out.print("Not Found");
            sc.close();
        }
    }
}