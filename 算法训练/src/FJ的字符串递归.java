import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 9:07
 **/
public class FJ的字符串递归 {
    private static void print(int n){
        if(n == 0){
            return;
        }
        print(n - 1);
        System.out.print((char)('A'+n-1));
        print(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            print(n);
        }
    }
}
