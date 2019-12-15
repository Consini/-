import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 10:04
 **/
/*问题描述
　　最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。
所以他准备和奶牛们做一个“Sine之舞”的游戏，寓教于乐，提高奶牛们的计算能力。
　　不妨设
　　An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
　　Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
　　FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
输入格式
　　仅有一个数：N<201。
输出格式
　　请输出相应的表达式Sn，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
样例输入
3
样例输出
((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1*/
public class Sine之舞 {
    private static void printAn(int n,int k){
        if(n == 0) return;
        printAn(n-1,k);
        if(n == 1){
            System.out.print("sin("+n);
        }else{
            System.out.print((n%2==0?"-":"+")+"sin("+n);
        }
        if(k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(")");
            }
        }
    }
    private static void printSn(int n,int k){
        if(n == 0) {
            return;
        }
        if(n != 1){
            System.out.print("(");
        }
        printSn(n-1,k);
        printAn(n,n);
        System.out.print("+" + (k-n+1));
        if(n != k){
            System.out.print(")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            printSn(n,n);
        }
    }
}
