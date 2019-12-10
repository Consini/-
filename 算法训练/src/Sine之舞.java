import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 10:04
 **/
public class Sine之舞 {
    private static void printAn(int n,int k){
        if(n == 0) return;
        printAn(n-1,k);
        if(n == 1){
            System.out.print("sin("+n);
        }else{
            System.out.print((n%2==0?"-":"+")+"sin("+n);
        }
        if(k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(")");
            }
        }
    }
    private static void printSn(int n,int k){
        if(n == 0) {
            return;
        }
        if(n != 1){
            System.out.print("(");
        }
        printSn(n-1,k);
        printAn(n,n);
        System.out.print("+" + (k-n+1));
        if(n != k){
            System.out.print(")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            printSn(n,n);
        }
    }
}
