import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 20:49
 **/
public class 数组操作 {
        private static void fun(int[] a,String[] s,int Case){
            switch (Integer.parseInt(s[0])) {
                case 1:
                    int l = Integer.parseInt(s[1]), r = Integer.parseInt(s[2]), d = Integer.parseInt(s[3]);
                    for (int i = l; i <= r; i++) {
                        a[i] += d;
                    }
                    break;
                case 2:
                    int l1 ,l2,r1,r2;
                    if(Case == 5 || Case == 6 || Case == 7){
                        l1 = 1;
                        r1 = (a.length-1)/2;
                        l2 = r1+1;
                        r2 = a.length-1;
                    }else {
                        l1 = Integer.parseInt(s[1]);
                        l2 = Integer.parseInt(s[2]);
                        r1 = Integer.parseInt(s[3]);
                        r2 = Integer.parseInt(s[4]);
                    }
                    for (int i = l2; i <= r2; i++) {
                        a[l1++] = a[i];
                    }
                    break;
                case 3:
                    int l3 = Integer.parseInt(s[1]), r3 = Integer.parseInt(s[2]);
                    int sum = 0;
                    for (int i = l3; i <= r3; i++) {
                        sum += a[i];
                    }
                    System.out.println(sum);
                default:
                    break;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int Case = Integer.parseInt(sc.nextLine());
                String[] tmp = sc.nextLine().split(" ");
                int n = Integer.parseInt(tmp[0]), m = Integer.parseInt(tmp[1]);
                int[] a = new int[n + 1];
                String[] t = sc.nextLine().split(" ");
                for (int i = 1; i < n + 1; i++) {
                    a[i] = Integer.parseInt(t[i - 1]);
                }
                while (m-- != 0) {
                    String[] s = sc.nextLine().split(" ");
                    fun(a, s, Case);
                }
            }
        }
}
