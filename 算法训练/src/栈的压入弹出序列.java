import java.util.ArrayList;

/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/12 9:53
 **/
public class 栈的压入弹出序列 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length==0 || pushA.length!=popA.length)
            return false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0,j = 0;i < pushA.length;i++){
            list.add(pushA[i]);
            while(!list.isEmpty() && list.get(list.size()-1) == popA[j]){
                list.remove(list.size()-1);
                j++;
            }
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b={4,3,5,1,2};
        System.out.println(IsPopOrder(a,b));
    }
}
