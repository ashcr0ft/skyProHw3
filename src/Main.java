public class Main {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        byte temperature = 18;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }

        byte ageTask4 = 100;
        if (ageTask4 >= 2 && ageTask4 <= 6) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в детский сад");
        }
        if (ageTask4 >= 7 && ageTask4 <= 17) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в школу");
        }
        if (ageTask4 >= 18 && ageTask4 <= 24) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в университет");
        }
        if (ageTask4 > 24) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить на работу");
        }

        byte ageTask5 = 4;
        if (ageTask5 < 5) {
            System.out.println("Если возраст ребенка равен " + ageTask5 + ", то ему нельзя кататься на аттракционе");
        }
        if (ageTask5 >= 5 && ageTask5 <= 14) {
            System.out.println("Если возраст ребенка равен " + ageTask5 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageTask5 > 14) {
            System.out.println("Если возраст ребенка равен " + ageTask5 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        short passengers = 60;
        short seat = 60;
        short total = 102;
        if (passengers < seat) {
            System.out.println("Есть сидячие и стоячие места");
        } else if (passengers >= seat && passengers < total) {
            System.out.println("Сидячих мест нет. Только стоячие");
        } else {
            System.out.println("Вагон забит");
        }

        int one = 10;
        int two = 11;
        int three = 9;
        if (one >= two && one >= three) {
            System.out.println("one =" + one);
        } else if (two >= one && two >= three) {
            System.out.println("two =" + two);
        } else {
            System.out.println("three =" + three);
        }


    }
}