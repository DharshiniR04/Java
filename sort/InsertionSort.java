import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int t=a[i];
            int j=i-1;
            while (j>=0 && a[j]>t) {
                a[j+1]=a[j]; 
                j--;
            }
            a[j+1]=t;
        }
        System.out.print("After Insertion Sort: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
