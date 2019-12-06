import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/5 10:31
 **/
public class 矩阵乘法 {
    private static void fun(int[][] a,int[][] b,int n){//n为矩阵行列数
        int i,j,k;
        int[][] c = new int[n][n];
        for(i = 0;i < n;i++){
            for(j = 0;j < n;j++){
                for(k = 0;k < n;k++){
                    c[i][j] += b[i][k] * a[k][j];
                }
            }
        }
        for(i = 0;i < n;i++){
            for(j = 0;j < n;j++){
                b[i][j] = c[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][n];
            int[][] result = new int[n][n];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    arr[i][j] = scanner.nextInt();
                }
            }
            for(int i = 0;i < n;i++){
                result[i][i] = 1;
            }
            for(int i = 0;i < m;i++){
                fun(arr,result,n);
            }
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
