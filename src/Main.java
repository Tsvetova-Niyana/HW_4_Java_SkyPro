public class Main {
    public static void main(String[] args) {
            task_1();
            task_2();
            task_3();
            task_4();
            task_5();
            task_6();
            task_7();
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

        int speed = 61;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }

    public static void task_4(){
        /*
        Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека
        в зависимости от его возраста:

        Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
        Если человеку больше 18 лет, но меньше 24, то его место в университете.
        А если человеку больше 24, то ему пора ходить на работу.
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        «Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».
         */

        System.out.println("\nЗадание 4");

        int age = 24;

        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            if (age > 18 && age < 24) {
                System.out.println("Если возраст человека равен " + age + ", то его место в университете");
            } else {
                if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                } else {
                    if (age >= 2 && age <= 6) {
                        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
                    }
        }
            }
                }
    }

    public static void task_5(){
        /*
        Как правило, на аттракционах действуют ограничения для детей по возрасту:

        Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        Если взрослого нет, то кататься нельзя.
        Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение в формате:
        «Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное:
        нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».
         */

        System.out.println("\nЗадание 5");

        int age = 14;

        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else {
            if (age > 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то может кататься только " +
                        "в сопровождении взрослого." + " Если взрослого нет, то кататься нельзя.");
            } else {
                if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + ", то может он может кататься " +
                            "без сопровождения взрослого");
                }
            }
        }
    }

    public static void task_6(){
        /*
        Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.

        С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение о том,
        есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.
         */
        System.out.println("\nЗадание 6");

        int countPeople = 1;

        if (countPeople >= 102) {
            System.out.println("Вагон уже полностью забит");
        } else {
            if (countPeople >= 60 && countPeople < 102) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                if (countPeople > 0 && countPeople < 60) {
                    System.out.println("В вагоне есть сидячие места");
                }
            }
        }
    }

    public static void task_7(){
        /*
        Даны три числа:

        int one;
        int two;
        int three;

        С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        какое из трех чисел бо́льшее, и выводит результат в консоль.
         */
        System.out.println("\nЗадание 7");

        int one = 26;
        int two = 17;
        int three = 33;

        if (one > two && one > three) {
            System.out.println("Самое большое число = " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Самое большое число = " + two);
            } else {
                System.out.println("Самое большое число = " + three);
            }
        }

    }
}
