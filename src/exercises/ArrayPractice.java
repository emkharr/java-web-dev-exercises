package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(ArrayPractice.findSum(arrList));

//        int[] arr = {1, 1, 2, 3, 5, 8};
//        for (int i : arr) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//
//        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] seussArr = seuss.split(" ");
//        System.out.println(Arrays.toString(seussArr));
    }

    public static Integer findSum(ArrayList<Integer> valuesToSum){

        Integer sum = 0;
        for (Integer i: valuesToSum) {
            if (i % 2 == 0) {
                 sum += i;
            }
        }
        return sum;
    }

}
