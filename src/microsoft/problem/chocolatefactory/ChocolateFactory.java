package microsoft.problem.chocolatefactory;

import java.util.Scanner;

public class ChocolateFactory {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//        For getting an Array
        System.out.print("Enter Number of packets : ");
        int n=scan.nextInt();

        int[] arr=new int[n];
        int element;
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter packet "+(i+1)+" : ");
            element= scan.nextInt();
            arr[i]=element;
        }
        
        emptyPackets(arr);
        moveZeros(arr);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }

//    function for pushing empty packets to the last
    static  void emptyPackets(int[] arr){
        boolean isSwapped=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped=true;
                }
            }
            if (!isSwapped) break;
        }
    }

//    Moving Zero to last position
    static void moveZeros(int[] arr){

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[j++]=arr[i];
            }
        }

        while(j< arr.length){
            arr[j++]=0;
        }

    }

    //   function for Swapping
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}