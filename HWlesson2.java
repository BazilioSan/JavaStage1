/*
Java. Level 1. Lesson 2. Homework
@autor Alexandr Shchekochikhin
@version dated 14-16.01.2019
 */

public class HWlesson2 {

    public static void main(String[] args) {
        changeOneZero();
        fillArray();
        multArray();
        fillDiagonalsBy1();
    }

        /*Task 1
         Make the integer array of 1 and 0. By cycle and condition change 0 to 1 and 1 to 0 */

    public static void changeOneZero() {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

        /* Task 2
        Make the empty integer array of size 8. By cycle fill it of digits 0 3 6 9 12 15 18 21 */

    public static void fillArray() {
        int[] arr = new int[8];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a * 3;
            System.out.println(arr[a]);
        }
    }

        /* Task 3
        Make an array [1,5,3,2,11,4,5,2,4,8,9,1]. By cycle digits less of 6 multiply by 2 */

    public static void multArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < 6) {
                arr[a] = arr[a] * 2;
            }
            System.out.println(arr[a]);
        }

    }

        /* Task 4
        Make an square integer array. By cycle fill diagonal elements by 1 */

    public static void fillDiagonalsBy1() {

        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                /* не успел разобраться как это сделать( */
                System.out.println(a[i][j]);
            }
        }


    }
}
