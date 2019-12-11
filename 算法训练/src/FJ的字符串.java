import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 9:09
 **/
public class FJ的字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "A";
        int k = 1;
        while(--n != 0){
            char c = (char)('A'+k);
            s = s + c + s.substring(0,s.length());
            k++;
        }
        System.out.println(s);
    }
}
