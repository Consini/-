import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 10:49
 **/
public class 十六进制转十进制 {//数据溢出问题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            double sum = 0;
            for(int i = s.length()-1,j = 0;i >= 0;i--,j++){
                char c = s.charAt(i);
                int ch = 0;
                switch (c){
                    case 'A':ch = 10;break;
                    case 'B':ch = 11;break;
                    case 'C':ch = 12;break;
                    case 'D':ch = 13;break;
                    case 'E':ch = 14;break;
                    case 'F':ch = 15;break;
                    default:ch = (int)(c-'0');break;
                }
                sum = sum + Math.pow(16,j)*ch;
            }
            System.out.println((long)sum);
        }
    }
}
