import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/16 16:57
 **/
/*问题描述
　　如果一个序列满足下面的性质，我们就将它称为摆动序列：
　　1. 序列中的所有数都是不大于k的正整数；
　　2. 序列中至少有两个数。
　　3. 序列中的数两两不相等；
　　4. 如果第i – 1个数比第i – 2个数大，则第i个数比第i – 2个数小；如果第i – 1个数比第i – 2个数小，则第i个数比第i – 2个数大。
　　比如，当k = 3时，有下面几个这样的序列：
　　1 2
　　1 3
　　2 1
　　2 1 3
　　2 3
　　2 3 1
　　3 1
　　3 2
　　一共有8种，给定k，请求出满足上面要求的序列的个数。*/
public class 摆动序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

    }
}
