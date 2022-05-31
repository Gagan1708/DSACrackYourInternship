import java.util.*;
public class SetMatZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("Enter the elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int out[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                out[i][j] = 1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    for(int k=0;k<m;k++){
                        out[k][j] = 0;
                    }
                    for(int u=0;u<n;u++){
                        out[i][u] = 0;
                    }
                }
                else if(out[i][j]==0){
                    continue;
                }
                else{
                    out[i][j] = mat[i][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(out[i][j]+" ");
            }
            System.out.println();
        }
    }
}
