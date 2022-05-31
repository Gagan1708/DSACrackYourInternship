import java.util.*;
class DupNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int res = 0;
        int count = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i]==a[j] && i!=j){
                    count++;
                }
            }
            if(count>0){
                res = a[i];
                break;
            }
        }
        System.out.println(res);
    }
}