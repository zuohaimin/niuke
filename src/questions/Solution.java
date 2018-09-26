package questions;

import java.util.Arrays;

/**
 * @Author: 束手就擒
 * @Date: 18-9-15 下午2:59
 * @Description:
 */

public class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] == target){
                    return true;
                }
            }


        }

        return false;
    }
//    public boolean Find(int target, int[][] array){
//        int row=0;
//        int col=array[0].length-1;
//        while(row<=array.length-1&&col>=0){
//            if(target==array[row][col])
//                return true;
//            else if(target>array[row][col])
//                row++;
//            else
//                col--;
//        }
//        return false;
//
//    }

    /**
     * 二分方
     * @param array
     * @param target
     * @return
     */
    public boolean Find(int [][] array,int target) {

        for(int i=0;i<array.length;i++){
            int low=0;
            int high=array[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(target>array[i][mid])
                    low=mid+1;
                else if(target<array[i][mid])
                    high=mid-1;
                else
                    return true;
            }
        }
        return false;

    }

    public boolean findAdavaced(int target, int[][] array){

        int j = 1;
        int i = 0;

        for ( int k = 0; i< array[0].length && j<=array.length; k++) {
            if (array[i][array.length - j] == target) {
                return true;
            }else if (array[i][array.length - j] > target){
                j++;

            }else if (array[i][array.length - j] < target){
                i++;
            }

        }
        return false;
    }
}