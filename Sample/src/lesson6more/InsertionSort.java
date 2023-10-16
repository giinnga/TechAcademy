package lesson6more;

import java.util.Arrays;

/* 挿入法 */
public class InsertionSort {
    public static void main(String[] args) {
        // 要素を並び替えたい配列
        int[] nums = new int[] { 4, 2, 3, 5, 1 };

        // 並び替えた後の数値を格納する配列
        int[] new_nums = new int[5];

        for (int i = 0; i < nums.length; i++) { // 確定させたい要素
            new_nums[i] = nums[i];
            for (int j = i; j > 0; j--) { // 最後尾の要素から開始
                // 前にある方が大きければ中身を入れ替える
                if (new_nums[j - 1] > new_nums[j]) {
                    int temp = new_nums[j - 1];
                    new_nums[j - 1] = new_nums[j];
                    new_nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(new_nums));
    }
}
