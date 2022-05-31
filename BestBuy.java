import java.util.*;
public class BestBuy {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        int mxtrav = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    mxtrav = a[j]-a[i];
                    if(mxtrav>max){
                        max = mxtrav;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
