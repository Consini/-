import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/6 16:26
 **/
//两个矩形分别求出x的最小值，然后求出两者的大值，就是相交矩形其中一个端点的x值
// 要判断两个矩形是否相交
public class 矩形面积交 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");
        double x1 = sc.nextDouble(),y1 = sc.nextDouble(),x2 = sc.nextDouble(),y2 = sc.nextDouble();
        double a1 = sc.nextDouble(),a2 = sc.nextDouble(), a3 = sc.nextDouble(),a4 = sc.nextDouble();
        double bx1,by1,bx2,by2;
        bx1=Math.max(Math.min(x1,x2),Math.min(a1,a3));
        by1 = Math.max(Math.min(y1,y2),Math.min(a2,a4));
        bx2 = Math.min(Math.max(x1,x2),Math.max(a1,a3));
        by2 = Math.min(Math.max(y1,y2),Math.max(a2,a4));
        if(bx2<=bx1){
            System.out.println(new DecimalFormat("0.00").format(0.0));
        }else{
            System.out.println(new DecimalFormat("0.00").format(1.0*(bx2-bx1)*(by2-by1)));
        }
    }
}
