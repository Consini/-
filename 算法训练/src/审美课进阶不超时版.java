import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.*;
import java.util.*;
/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/15 23:13
 **/
public class 审美课进阶不超时版 {
    private static Reader reader;//字符对象从控制台输入
    private static int getInt() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        StringBuilder sb = new StringBuilder();
        while((line=bufferedReader.readLine()) != null){
            sb.append(line+"\r\n");//自己加换行，否则readLine会自动去掉换行，读出的数据就是一行
        }
        return Integer.valueOf(sb.toString(),2);
    }
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new TreeMap<>();
        int n = getInt(),m = getInt();
        while(n-- != 0) {
            int num = getInt();

            }
            int num= Integer.valueOf(sb.toString(),2);
            System.out.println(num);
//            if(map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//            }else{
//                map.put(num,1);
//            }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int k = entry.getKey()^1;
            if(map.containsKey(k)){
                sum = sum + entry.getValue()*map.get(k);
            }
        }
        System.out.println(sum/2);
    }
}
