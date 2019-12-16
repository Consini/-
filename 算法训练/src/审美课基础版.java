import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 22:54
 **/
public class 审美课基础版 {
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
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                int sum = 0;
                Map<String,Integer> map = new TreeMap<>();
                String[] c = sc.nextLine().split(" ");
                int n = Integer.parseInt(c[0]),m = Integer.parseInt(c[1]);
                for(int i = 0;i < n;i++){
                    String s = sc.nextLine();
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
}
