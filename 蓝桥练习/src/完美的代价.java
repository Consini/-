import java.util.Scanner;
public class 完美的代价 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int length = Integer.parseInt(scanner.nextLine());
            char[] string = scanner.nextLine().toCharArray();
            int[] arr = new int[26];//计数器数组，判断是否可以转换为回文，看有几个字符出现次数为奇数
            for (int i = 0; i < string.length; i++) {
                int index = string[i] - 'a';
                arr[index]++;
            }
            int oldCharNum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2 != 0) {
                    oldCharNum++;
                }
            }
            if (oldCharNum >= 2) {
                System.out.println("Impossible");
                return;
            }
            int changeCount = 0,oldCharIndex = -1;
            int i = 0,j = length - 1;
            for ( i = 0;i < (length+1)/2;i++){
                if(string[i] != string[j]){
                    int jIndex = j - 1;
                    while(jIndex > i && string[i] != string[jIndex]){
                        jIndex--;
                    }
                    if(jIndex == i){
                        oldCharIndex = i;
                        j++;
                    }else{
                        while(jIndex < j){
                            char t = string[jIndex];
                            string[jIndex] = string[jIndex+1];
                            string[jIndex+1] = t;
                            jIndex++;
                            changeCount++;
                        }
                    }
                }
                j--;
            }
            int m = 0;
            if(oldCharIndex > -1){
                m = length/2 - oldCharIndex;
            }
            System.out.println(changeCount+m);
        }
    }
}
