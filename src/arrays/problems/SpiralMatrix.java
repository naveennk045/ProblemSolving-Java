package arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom= matrix.length-1;

        while(top<=bottom && left<=right){
//            from left to right
            for (int i = left; i <=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
//            from top to bottom
            for (int i = top; i <=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
//            from right to left
            if(top<=bottom){
                for (int i = right; i >=left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if ((left<=right)){
                for (int i = bottom; i >=top ; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] mat={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                    };
       List<Integer> list= spiralOrder(mat);
        System.out.println(list);
        
    }
}