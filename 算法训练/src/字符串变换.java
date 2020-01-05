import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/16 16:02
 **/
/*1 表示全部转化为大写字母输出，如abC 变成 ABC
　　2 表示全部转换为小写字母输出，如abC变成abc
　　3 表示将字符串整个逆序输出，如 abc 变成 cba
　　4 表示将字符串中对应的大写字母转换为小写字母，而将其中的小写字母转化为大写字母输出，如 abC变成ABc
　　5表示将全部转换为小写字母，并将其中所有的连续子串转换为对应的缩写形式输出，
比如abcD 转换为a-d，其次，-至少代表1个字母，既如果是ab，则不需要转换为缩写形式。*/
public class 字符串变换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        String s = sc.next();
        switch (op){
            case 1:
                System.out.println(s.toUpperCase());
                break;
            case 2:
                System.out.println(s.toLowerCase());
                break;
            case 3:
                StringBuffer str = new StringBuffer(s);
                System.out.println(str.reverse().toString());
                break;
            case 4:
                for(int i = 0;i < s.length();i++){
                    if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                        System.out.print((char)(s.charAt(i)-'A'+'a'));
                    }else{
                        System.out.print((char)(s.charAt(i)-'a'+'A'));
                    }
                }
                break;
            case 5:
                if(s.length() > 0) {
                /*　5表示将全部转换为小写字母，并将其中所有的连续子串转换为对应的缩写形式输出，
比如abcD 转换为a-d，其次，-至少代表1个字母，既如果是ab，则不需要转换为缩写形式。*/
                    s = s.toLowerCase();
                    StringBuffer st = new StringBuffer();
                    st.append(s.charAt(0));
                    for(int i = 1,j = 0;i < s.length();i++){
                        while(i+j < s.length() && (char)(s.charAt(i+j)-j) == s.charAt(i)){
                            j++;
                        }
                        if(j > 1) {
                            st.append('-');
                        }
                        st.append(s.charAt(j));
                        i+=j;
                    }
                    System.out.println(st.toString());
                }
                break;
            default:break;
        }
    }
}
