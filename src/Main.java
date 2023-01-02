public class Main {
    public static void main(String[] args) {
            task_1();
            task_2();
            task_3();
    }
    public static void task_1(){
        System.out.println("Задание 1");

        int age = 15;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
    }

    public static void task_2(){
        System.out.println("\nЗадание 2");

        int temperature = 0;

        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task_3(){
        System.out.println("\nЗадание 3");
    }
}
