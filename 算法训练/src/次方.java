import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 17:30
 **/
public class 次方 {
    private static double fun(double b,int e){
        double ret = 1;
        while(e-- != 0){
            ret *= b;
        }
        return ret;
    }
    public static double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(base == 0){
            return 0;
        }
        boolean b = false;
        double ret = fun(Math.abs(base),Math.abs(exponent));
        if(base > 0){
            if(exponent > 0){
                return ret;
            }
            return 1/ret;
        }
        if(exponent%2 != 0 && exponent > 0){
            return -ret;
        }
        return -1/ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double a = sc.nextDouble();
            int e = sc.nextInt();
            System.out.println(Power(a,e));
        }
    }
}
