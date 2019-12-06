import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/5 10:44
 **/
public class 二进制数数 {
    private static int numOfBinary(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int num = 0;
        for(int i = l;i <= r;i++){
            num += numOfBinary(i);
        }
        System.out.println(num);
    }
}
