package lesson6more;

import java.util.Arrays;

/* 交換法 */
public class BubbleSort {
    public static void main(String[] args) {
        // 要素を並び替えたい配列
        int[] nums = new int[] { 4, 2, 3, 5, 1 };

        for (int i = 0; i < nums.length - 1; i++) { // 確定させたい要素
            for (int j = nums.length - 1; j > i; j--) { // 最後尾の要素から開始
                // 前にある方が大きければ中身を入れ替える
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}