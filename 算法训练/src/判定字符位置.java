import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/19 22:42
 **/
public class 判定字符位置 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        for( i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'e'||c=='o'||c=='u'||c=='i'){
                System.out.println(i+1);
                break;
            }
        }
        if(i == s.length()) {
            System.out.println(0);
        }
    }
}
