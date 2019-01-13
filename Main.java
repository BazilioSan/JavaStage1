/*Александр Щекочихин
Домашнее задание к уроку 1
 */


package geekbrains.javaStageOne;

import java.util.Scanner;

/*Задание №1 создать пустой проект и прописать метод Main */

public class Main {
    /*Дополнительное задание вызвать отдельно заданные методы */
    public static void main(String[] args) {
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();

        /*Задание №2 создать переменные всех пройденных типов данных и инициализировать их значения         */

        byte a1 = 100;
        short a2 = 100;
        int a3 = 100;
        long a4 = 100L;
        float a5 = 100.0f;
        double a6 = 100.00;
        boolean a7 = true;
        char a8 = 100;
    }

        /* Задание №3 Написать метод вычисляющий выражение a*(b+(c/d)) и возвращающий
        результат, где a-d входные параметры этого метода */

        static void task_3 () {

            System.out.println("Я посчитаю для тебя a*(b+(c/d))");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число а");
            int a = scanner.nextInt();
            System.out.println("Введи число b");
            int b = scanner.nextInt();
            System.out.println("Введи число c");
            int c = scanner.nextInt();
            System.out.println("Введи число d");
            int d = scanner.nextInt();

            int result = a * (b + (c / d));
            System.out.println("Result= " + result);
        }
        /* Задание №4 Написать метод принимающий на вход два числа и проверяющий, что их сумма лежит
        в пределах от 10 до 20 включительно. true\false на выходе.

        */

        static void task_4 () {

            System.out.println("Я скажу, лежит ли результат между 10 и 20");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи число а");
            int a = scanner.nextInt();
            System.out.println("Введи число b");
            int b = scanner.nextInt();
            int result2 = a + b;
            System.out.println("Result a+b = " + result2);

            if (result2 >= 10 && result2 <= 20) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
         /*Задание №5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в
         консоль положительное или отрицательное число передали.


          */

        static void task_5 () {

            System.out.println("Я скажу отрицательное или подожительное у тебя число");
            Scanner scanner = new Scanner(System.in);
                    System.out.println("Введи число а");
                int a = scanner.nextInt();
                if (a >= 0) {
                    System.out.println("Positive");
                } else {
                    System.out.println("Negative");
            }
        }
         /* Задание №6 Написать метод, возвращающий true если число отрицательное

            Для разнообразия относительно предыдущей задачи, введем boolean
          */

         static void task_6() {

             System.out.println("Я скажу тебе, правда ли число отрицательное");
             Scanner scanner = new Scanner(System.in);
             System.out.println("Введи число а");
             int a = scanner.nextInt();

            boolean task6 = (a < 0);
                if (task6) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
        }
         /* Задание №7 написать метод, которому в качестве параметра выдается строка имени, с выводом в консоль
         "Привет + имя"
         */

        static void task_7 () {
            Scanner sc = new Scanner(System.in);
                System.out.println("Whats your name? ");
            String task7 = sc.nextLine();
                System.out.println("Hello " + task7 + "!");
        }

        /* Задание №8 Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
         *
         * */

        static void task_8 () {

            Scanner sc_task8 = new Scanner(System.in);
            System.out.println("Введите Год : ");
            double yearin = sc_task8.nextInt();

            if (yearin % 4 == 0 && yearin % 100 != 0 || yearin % 400 == 0) {
                System.out.println("Високосный!");
            } else {
                System.out.println("Не високосный!");
            }


        }

    }






