package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static boolean isIdentity(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j && arr[i][j]!=1){
                    return false;
                }
                if(i!=j && arr[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static int sumOfDiagonal(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
        }
        return sum;
    }
    public static int sumOfDiagonalI(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j || j==arr[0].length-i-1) sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void printX(String word) {
        int n = word.length();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i == j) {
                    System.out.print(word.charAt(i));
                } else if (j == n - i - 1) {
                    System.out.print(word.charAt(n-i-1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void sumOfRowWise(int[][] arr){
        for(int row=0;row<arr.length;row++){
            int sum=0;
            for(int col=0;col<arr[row].length;col++){
                sum+=arr[row][col];
            }
            System.out.printf("Row %d : %d%n",row,sum);
        }
    }
    public static void sumOfColumnWise(int[][] arr){
        for(int col=0;col<arr[0].length;col++){
            int sum=0;
            for(int row=0;row<arr.length;row++){
                sum+=arr[col][row];
            }
            System.out.printf("col %d : %d%n",col,sum);
        }
    }



    public  static void print(int[][] arr) {
        for(int row=0;row<arr.length;row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//
        int rowSize=scan.nextInt();
        int[][] arr=new int[rowSize][];

        for(int row=0;row<rowSize;row++){
            int colSize= scan.nextInt();
            arr[row]=new int[colSize];
            for (int col = 0; col < colSize; col++) {
                arr[row][col]=scan.nextInt();
            }
        }
//
//        System.out.println(isIdentity(arr));
//        System.out.println(sumOfDiagonal(arr));
//        sumOfRowWise(arr);
//        sumOfColumnWise(arr);
//        System.out.println(sumOfDiagonalI(arr));
        printX("Program");



        print(arr);
    }


}