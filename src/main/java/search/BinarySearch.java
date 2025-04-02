package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ary = new int[]{10,12,15,19,20,102};
        System.out.println(search(ary,102,ary.length-1,0));
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

    //recursive
    public static int search(int[]array, int value, int high, int low){
        if(high>=low){
            int mid = low +(high-low)/2;
            if(array[mid]==value){
                return mid;
            }else if(array[mid]>value){
                high = mid-1;
                return search(array, value, high,low);
            }else if(array[mid]<value){
                low = mid+1;
                return search(array, value, high,low);
            }
        }
        return -1;
    }
}
