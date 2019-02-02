/**
 Java. Level 1. Lesson 5. Homework
 @author Alexandr Shchekochikhin
 @version dated 02/02/19
 */

class SlayerHWLesson5 {

    public static void main(String[] args) {

        Slayer [] slayerArray = new Slayer[5];

            slayerArray [0] = new Slayer( "Ivan" ,"CEO", "Ivan@mail.ru" , 268135, 150000, 48);
            slayerArray [1] = new Slayer("Svetlana", "Secretary", "Svetlana@mail.ru", 269, 50000, 23);
            slayerArray [2] = new Slayer("Constantin", "Lead HSE", "Constantin@mail.ru", 131, 100000, 45 );
            slayerArray [3] = new Slayer("Maria", "Assistant", "Maria@mail.ru", 150, 75000, 30);
            slayerArray [4] = new Slayer("Sergey", "HTD", "Sergey@mail.ru", 160, 100000, 42);

            for (int i = 0; i < slayerArray.length; i++) {
                if (Slayer.age > 40)
                    System.out.println(slayerArray[i]);
            }
    }

    class Slayer {
        String name;
        String position;
        String email;
        int tel;
        long salary;
        int age;

        Slayer(String name, String position, String email, int tel, long salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.tel = tel;
            this.salary = salary;
            this.age = age;
        }

    }
}

