/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/16 11:29
 **/
import java.util.*;
class fuShu{
    double real;
    double image;
    public fuShu(){
    }
    public fuShu(double real,double image){
        this.real = real;
        this.image = image;
    }
    public static void add(fuShu c1,fuShu c2){
        double real = c1.real+c2.real;
        double image = c1.image+c2.image;
        System.out.println(String.format("%.2f",real)+"+"+String.format("%.2f",image)+"i");
    }
    public static void sub(fuShu c1,fuShu c2){
        System.out.println(String.format("%.2f",c1.real-c2.real)+"+"+String.format("%.2f",c1.image-c2.image)+"i");
    }
    public static void mul(fuShu c1,fuShu c2){
        double real = c1.real*c2.real-c1.image*c2.image;
        double image = c1.image*c2.real+c1.real*c2.image;
        System.out.println(String.format("%.2f",real)+"+"+String.format("%.2f",image)+"i");
    }
    public static void div(fuShu c1,fuShu c2){
        double real = (c1.real*c2.real+c1.image*c2.image)/(c2.real*c2.real+c2.image*c2.image);
        double image = (c1.image*c2.real-c1.real*c2.image)/(c2.real*c2.real+c2.image*c2.image);
        System.out.println(String.format("%.2f",real)+"+"+String.format("%.2f",image)+"i");
    }
}
public class 复数运算P1103 extends fuShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            char op = s.charAt(0);
            double a = sc.nextDouble(),b = sc.nextDouble(),c = sc.nextDouble(),d = sc.nextDouble();
            fuShu c1 = new fuShu(a,b);
            fuShu c2 = new fuShu(c,d);
            switch (op){
                case '+':add(c1,c2);
                    break;
                case '-':sub(c1,c2);
                    break;
                case '*':mul(c1,c2);
                    break;
                case '/':div(c1,c2);
                    break;
                default:break;
            }
        }
    }
}
