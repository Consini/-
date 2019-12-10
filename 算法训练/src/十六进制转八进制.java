/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/10 19:30
 **/
import java.util.*;
public class 十六进制转八进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n != 0){
            n--;
            String s = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer result = new StringBuffer();
            for(int i = 0;i < s.length();i++){
                char sTmp = s.charAt(i);
                switch (sTmp){
                    case '0':stringBuffer.append("0000");break;
                    case '1':stringBuffer.append("0001");break;
                    case '2':stringBuffer.append("0010");break;
                    case '3':stringBuffer.append("0011");break;
                    case '4':stringBuffer.append("0100");break;
                    case '5':stringBuffer.append("0101");break;
                    case '6':stringBuffer.append("0110");break;
                    case '7':stringBuffer.append("0111");break;
                    case '8':stringBuffer.append("1000");break;
                    case '9':stringBuffer.append("1001");break;
                    case 'A':stringBuffer.append("1010");break;
                    case 'B':stringBuffer.append("1011");break;
                    case 'C':stringBuffer.append("1100");break;
                    case 'D':stringBuffer.append("1101");break;
                    case 'E':stringBuffer.append("1110");break;
                    case 'F':stringBuffer.append("1111");break;
                    default:break;
                }
            }
            if(stringBuffer.length()%3 == 1){
                stringBuffer.insert(0,"00");
            }else if(stringBuffer.length()%3 == 2){
                stringBuffer.insert(0,"0");
            }
            for(int i = 0;i < stringBuffer.length() - 2;i+=3){
                String tmp = stringBuffer.substring(i,i+3);
                if(tmp.equals("000") && i != 0) result.append("0");
                else if(tmp.equals("001")) result.append("1");
                else if(tmp.equals("010")) result.append("2");
                else if(tmp.equals("011")) result.append("3");
                else if(tmp.equals("100")) result.append("4");
                else if(tmp.equals("101")) result.append("5");
                else if(tmp.equals("110")) result.append("6");
                else if(tmp.equals("111")) result.append("7");
            }
            System.out.println(result);
        }
    }
}
