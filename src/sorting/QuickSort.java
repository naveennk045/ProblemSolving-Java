package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] nums,int low,int high){

        if(low>=high) return;

        int start=low;
        int end=high;

        int mid=start+(end-start)/2;
        int pivot=nums[mid];

        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }while(nums[end]>pivot){
                end--;
            }
           if(start<=end) {
               Swap.swap(nums,start,end);
               start++;
               end--;
           }
        }

        sort(nums,low,end);
        sort(nums,start,high);
    }
    public static void main(String[] args) {
        int[]  nums={0,9,3,1,2,7,6,4,10,5,8};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}