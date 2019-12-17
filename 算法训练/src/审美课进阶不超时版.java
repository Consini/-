import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 23:13
 **/
public class 审美课进阶不超时版 {
    private static InputStream in = System.in;//字符对象从控制台输入
    private static BufferedReader br = null;
    private static String getString(int size) throws IOException {
        br = new BufferedReader(new InputStreamReader(in));
        byte[] buf = new byte[size];
        int len = in.read(buf);
        String s = new String(buf, 0, len);
        return s;
    }
    private static String reserve(String s){
        String ret = "";
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != ' ') {
                ret += (char)(s.charAt(i) ^ 1);
            }else{
                ret += ' ';
            }
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        Map<String,Integer> map = new TreeMap<>();
//        String[] c = getString().toString().split(" ");
//        int n = Integer.parseInt(c[0]),m = Integer.parseInt(c[1]);
        String[] c = sc.nextLine().split(" ");
        int n = Integer.parseInt(c[0]),m = Integer.parseInt(c[1]);
        for(int i = 0;i < n;i++){
            String s = getString(2*m);
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String st = reserve(entry.getKey());
            if(map.containsKey(st)){
                sum = sum + entry.getValue()*map.get(st);
            }
        }
        System.out.println(sum/2);
    }
}
