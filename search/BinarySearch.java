import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int target=sc.nextInt();
            int l = 0, h = n - 1;
            while (l <= h) {
                int m=(l+h)/2;
                if(a[m]==target){
                    System.out.print("Found at "+m);
                    return;
                }
                else if(a[m]>target) h=m-1;
                else l=m+1;
            } 
            System.out.print("Not Found");
            sc.close();
        }
    }
}
