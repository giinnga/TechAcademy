package lesson6more;

import java.util.Arrays;

/* 選択法 */
public class select {

    public static void main(String[] args) {
        //要素を並べ替えたい配列
        int[] nums = new int[] {4, 2, 3, 5, 1};

        for(int i = 0; i < nums.length - 1; i++) { //確定させたい要素 配列0番目からインデックス最後から2番目まで
            for(int j = i + 1; j < nums.length; j++) { //その次の要素から開始

                //前にある方が大きければ中身を入れ替える
                if(nums[i] > nums[j]) {

                    int temp = nums[i]; //tempに一時的に数値i入れる
                    nums[i] = nums[j];  //jにiの値を代入
                    nums[j] = temp;     //tempにjの値を代入
                }

            }


        }

        System.out.println(Arrays.toString(nums));
    }


}
