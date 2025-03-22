package Search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ary = new int[]{0,1,2,99,5,7,3};
        System.out.println(search(ary,99));
    }

    public static int search(int[] array, int value){
        Arrays.sort(array);
        int min = 0 ;
        int max = array.length-1;
        int mid = (min + max)/2;
        while(min<=max){
            if(array[mid] == value){
                return mid;
            }else if(array[mid] < value){
                min = mid+1;
                mid = (min + max)/2;
            }else if(array[mid]> value){
                max = mid-1;
                mid = (min + max)/2;
            }
        }
        return -1;
    }
}
