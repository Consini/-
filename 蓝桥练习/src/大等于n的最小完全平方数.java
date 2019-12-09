import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/5 10:51
 **/
public class 大等于n的最小完全平方数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long num = Math.round(Math.sqrt(n)+0.49);
        System.out.println(num*num);
    }
}
