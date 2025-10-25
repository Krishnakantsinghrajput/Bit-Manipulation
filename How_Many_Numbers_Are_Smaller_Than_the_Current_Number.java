import java.util.*;
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int ar[]={8,1,2,2,3};
        int result[]=fun(ar);
        for(int i:result){
            System.out.print(i+" ");
        }
    }

    public static int[] fun(int ar[]){
        int Sorted[]=new int[ar.length];
        for(int i=0;i<ar.length;i++){
            Sorted[i]=ar[i];
        }
        Arrays.sort(Sorted);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<Sorted.length;i++){
            map.putIfAbsent(Sorted[i], i);
        }

        for(int i=0;i<Sorted.length;i++){
            Sorted[i]=map.get(ar[i]);
        }
        return Sorted;
    }
}
