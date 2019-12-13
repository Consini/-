import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/12 10:41
 **/
public class 删除数组零元素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int len = sc.nextInt();
            int[] a = new int[len];
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i < len;i++){
                int t = sc.nextInt();
                a[i] = t;
                if(t != 0){
                    list.add(t);
                }
            }
            System.out.println(list.size());
            if(list.size()!=0) {
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size() - 1));
            }
        }
    }
}
