import java.util.*;
public class RemDupSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = a[n-1] - a[0] + 1;
        System.out.print(k+","+" ");
        for(int i=a[0];i<=a[n-1];i++){
            System.out.print(i+" ");
        }
    }
}
