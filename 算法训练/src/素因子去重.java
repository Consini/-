import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 17:31
 **/
/*问题描述
　　给定一个正整数n，求一个正整数p，满足p仅包含n的所有素因子，且每个素因子的次数不大于1
输入格式
　　一个整数，表示n
输出格式
　　输出一行，包含一个整数p。
样例输入
1000
样例输出
10
数据规模和约定
　　n<=10^12
　　样例解释：n=1000=2^3*5*3，p=2*5=10*/
public class 素因子去重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double n = sc.nextDouble();
            Set<Integer> set = new TreeSet<>();
            int ret = 1;
            for(int i = 2;i <= n;i++){
                if(n%i == 0){//i是n的因子
                    int j = 0;
                    for(j = 2;j <= Math.sqrt(i);j++){
                        if(i%j == 0){
                            break;
                        }
                    }
                    if(j > Math.sqrt(i) && set.add(i)){
                        n /= i;
                        ret *= i;
                        i = 2;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
