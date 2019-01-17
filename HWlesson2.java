/*
Java. Level 1. Lesson 2. Homework
@autor Alexandr Shchekochikhin
@version dated 14-16.01.2019
 */

public class HWlesson2 {

    public static void main(String[] args) {

        /*Task 1
         Make the integer array of 1 and 0. By cycle and condition change 0 to 1 and 1 to 0 */

        public static void changeOneZero (){
            int[] arr = {1,0,1,1,0,1,1,1,0,1,0,0,1,1,0,0};
                for (int a = 0, a < arr.length, a++){
                    if (int a == 0){
                        int a = 1
                    } else {
                        int a = 0
                    }
                }
            System.out.println( arr );
    }

        /* Task 2
        Make the empty integer array of size 8. By cycle fill it of digits 0 3 6 9 12 15 18 21 */

        public static void fillArray () {
            int [] arr = new int [8];
                for (int a = 0, a < arr.length, a++) {
                    if (a <= 21){
                        a= a+3
                    }else {break}
            };
            System.out.println(a);
        }

        /* Task 3
        Make an array [1,5,3,2,11,4,5,2,4,8,9,1]. By cycle digits less of 6 multiply by 2 */

        public static void multArray () {
            int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
                for (int a = 0, a < arr.length, a++){
                    if (a < 6){
                        a = a*2
                    }
                System.out.println(a);
            }

        }
        }
    }
}

