import java.util.Scanner;
/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/16 12:42
 **/
/*问题描述
　　给定实数x，输出sign(x)的值。sign(x)是符号函数，如果x>0，则返回1；如果x=0，则返回0；如果x<0，则返回-1。
输入格式:一行一个实数x。
输出格式:一行一个整数表示答案。
样例输入  -0.0001
样例输出  -1
数据规模和约定  |x|<=10000，输入数据精度最多达到4位小数。
提示：判断实数x是否等于零时，由于计算机实数运算误差，应当引入极小量eps，核心代码如下：
　　其中fabs为cmath中的绝对值函数。
　　const double eps=1e-6;
　　if (fabs(x) <= eps) {
　　//x是零
　　}*/
public class Sign函数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = 1e-6;
        double x = sc.nextDouble();
        if(Math.abs(x)<eps){
            System.out.println(0);
        }else if(x>eps){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
