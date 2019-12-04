import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/4 15:21
 **/
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[][] arr = new int[n][n];
            arr[0][0] = 1;
            for(int i = 1;i < n;i++){
                arr[i][0] = 1;
                arr[i][i] = 1;
                for(int j = 1;j < i;j++){
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
            for(int i = 0;i<n;i++){
                for(int j = 0;j<i;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(arr[i][i]);
            }
        }
    }
}
