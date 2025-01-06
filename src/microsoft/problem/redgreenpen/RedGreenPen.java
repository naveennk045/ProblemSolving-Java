package microsoft.problem.redgreenpen;

import java.util.Scanner;

public class RedGreenPen {
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
        System.out.println("Teacher wants to Switch "+switchCount(arr)+" times");
    }

//    For counting the switches
    static int  switchCount(int[] a){
        int count=0;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]%2!=0&&a[i+1]%2==0){
                count+=1;
            }
        }
    return count;
    }
}