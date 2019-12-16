import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/16 16:48
 **/
/*问题描述
　　有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。
要将这个长度为N的地板铺满，一共有多少种不同的铺法？
　　例如，长度为4的地面一共有如下5种铺法：
　　4=1+1+1+1
　　4=2+1+1
　　4=1+2+1
　　4=1+1+2
　　4=2+2
　　编程用递归的方法求解上述问题。*/
public class 瓷砖铺放 {
    private static int fun(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fun(n);
        System.out.println(sum);
    }
}
