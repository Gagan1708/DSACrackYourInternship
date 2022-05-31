import java.util.*;
public class MoveZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        if(n==1){
            System.out.println(a[0]);
        }
        else{
            int c = 0;
            for(int i=0;i<n-1;i++){
                for(int j=c+1;j<n;j++){
                    if(a[j]!=0){
                        a[i] = a[j];
                        c = j;
                        break;
                    }
                }
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        a[j] = 0;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
