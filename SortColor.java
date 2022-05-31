import java.util.*;
public class SortColor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++){
            c1 = (a[i]==0) ? c1+1 : c1;
            c2 = (a[i]==1) ? c2+1 : c2;
            c3 = (a[i]==2) ? c3+1 : c3;
        }
        int i=0;
        while(c1>0){
            a[i] = 0;
            c1--;
            i++;
        }
        while(c2>0){
            a[i] = 1;
            c2--;
            i++;
        }
        while(c3>0){
            a[i] = 2;
            c3--;
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+" ");
        }
    }
}
