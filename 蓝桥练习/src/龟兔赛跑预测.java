import java.util.Scanner;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/8 10:44
 **/
public class 龟兔赛跑预测 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt(),v2 = sc.nextInt(),t = sc.nextInt(),s = sc.nextInt(),l = sc.nextInt();
        int torTime = l/v2;
        int rabRun = 0,rabXiu = 0;
        int torRun = 0,rabLu = 0;
        while(torRun < torTime && rabLu < l){
            if(rabRun*v1 - t >= v2*torRun){
                rabXiu+=s;
                torRun+=s;
            }else{
                rabRun++;
                rabLu += v1;
                torRun++;
            }
        }
        if(torTime == rabRun+rabXiu && torRun == torTime && rabLu == l){
            System.out.println("D");
            System.out.println(torTime);
        }else if(torTime < rabRun+rabXiu || (torRun == torTime&& rabLu < l)){
            System.out.println("T");
            System.out.println(torTime);
        }else{
            System.out.println("R");
            System.out.println(rabRun+rabXiu);
        }
    }
}
