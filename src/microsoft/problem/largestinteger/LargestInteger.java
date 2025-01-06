package microsoft.problem.largestinteger;

import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//        For getting an Array
        System.out.print("Enter Length of an Array : ");
        int n=scan.nextInt();

        int[] arr=new int[n];
        int element;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter Element "+(i+1)+" : ");
            element= scan.nextInt();
            arr[i]=element;
        }

//        Calling Function
        findLargest(arr);

        System.out.print("The Largest Integer is ");
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
//function for finding Largest Integer
    static void findLargest(int[] arr){
        while(true){
            boolean isSwap=false;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                    isSwap=true;
                }
            }

            if(!isSwap){
                break;
            }

        }
   }
//   function for Swapping
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}