package basics;

import java.util.Arrays;
import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int [] input = new int[]{3,3,3,3};
        frequencyCount(input,4,3);
    }

    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        for(int i=1;i<=P;i++){
            if(map.get(i)!=null){
                arr[i-1] = map.get(i);
            }else{
                arr[i-1] = 0;
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
