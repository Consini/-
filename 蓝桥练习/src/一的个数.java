import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/5 11:19
 **/
public class 一的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i = 1;i <= n;i++){
            int num = i;
            while(num != 0){
                if(num%10 == 1){
                    count++;
                }
                num/=10;
            }
        }
        System.out.println(count);
    }
}
