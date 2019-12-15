import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 21:10
 **/
/*编写一个程序，读入一组整数，这组整数是按照从小到大的顺序排列的，它们的个数N也是由用户输入的，
最多不会超过20。然后程序将对这个数组进行统计，把出现次数最多的那个数组元素值打印出来。
如果有两个元素值出现的次数相同，即并列第一，那么只打印较小的那个值。
例如，假设用户输入的是“100 150 150 200 250”，则输出为150。
输入:
　　6
　　100 150 150 200 200 250
输出:
　　150*/
public class P0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            Map<Integer,Integer> map = new TreeMap<>();
            for(int i = 0;i < n;i++){
                int num = sc.nextInt();
                if(map.containsKey(num)){
                    int a = map.get(num);
                    map.put(num,a+1);
                }else{
                    map.put(num,1);
                }
            }
            int max = 0;
            int maxNum = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxNum = entry.getKey();
                }
            }
            System.out.println(maxNum);
        }
    }
}
