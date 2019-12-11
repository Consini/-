import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/2 23:43
 **/
public class 回形取数 {
    private static List<Integer> list = new ArrayList<>();
        private static void printArr(int[][] arr,int row,int col,int start){
            int endX = col - 1 - start;
            int endY = row - 1 - start;
            // 从上到下
             for (int y = start; y <= endY; y++) {
                 list.add(arr[y][start]);
             }
            //从左到右
            for(int x = start + 1;x <= endX;x++){
                 list.add(arr[endY][x]);
            }
            //从下到上
            if(endX > start && endY > start) {
                for (int i = endY - 1; i >= start; i--) {
                    list.add(arr[i][endX]);
                }
            }
            //从右到左
            if(start < endY && start+1 < endX) {
                for (int j = endX - 1; j > start; j--) {
                    list.add(arr[start][j]);
                }
            }
        }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         while(scanner.hasNext()){
             int m = scanner.nextInt();
             int n = scanner.nextInt();
                 int[][] arr = new int[m][n];
                 for(int i = 0;i < m;i++){
                     for(int j = 0;j < n;j++){
                         arr[i][j] = scanner.nextInt();
                     }
                 }
                 int start = 0;
                 while(start * 2 < m && start * 2 < n){
                     printArr(arr,m,n,start);
                     start++;
                 }
                for(int i = 0;i < list.size();i++){
                     if(i == list.size() - 1){
                         System.out.println(list.get(i));
                     }else {
                         System.out.print(list.get(i) + " ");
                     }
                }
            }
        }
}
