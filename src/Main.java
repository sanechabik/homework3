public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int cat = 256;
        System.out.println("Значение переменной cat, стипом int, равно 256.");
        byte bog = 100;
        System.out.println("Значение переменной dog, с типом byte, равно 100.");
        short apple = 17000;
        System.out.println("Значение переменной apple, с типом short, равно 17000.");
        long many = 50000000;
        System.out.println("Значение переменной many, с типом long, равно 50000000.");
        float gram = 5.77f;
        System.out.println("Значение переменной gram, с типом float, равно 5.77.");
        double centimeter = 3.5677;
        System.out.println("Значение переменной centimeter, с типом double, равно 3.5677.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("Задача выполнена.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte teacherChildren1 = 23;
        byte teacherChildren2 = 27;
        byte teacherChildren3 = 30;
        short boughtPapers = 480;
        int totalChildren = teacherChildren1 + teacherChildren2 + teacherChildren3;
        int oneChildren = boughtPapers / totalChildren;
        System.out.println("На каждого ученика рассчитано " + oneChildren + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        byte minute = 16 / 2;
        System.out.println("Машина изготавливает " + minute + " бутылок за минуту.");
        byte time1 = 20;
        System.out.println("За " + time1 + " минут машина произвела " + minute * time1 + " штук бутылок.");
        int time2 = 60 * 24;
        System.out.println("За " + time2 + " минуты (сутки) машина произвела " + minute * time2 + " штук бутылок.");
        int time3 = time2 * 3;
        System.out.println("За " + time3 + " минуты (3 дня) машина произвела " + minute * time3 + " штук бутылок.");
        int time4 = time2 * 30;
        System.out.println("За " + time4 + " минуты (месяц) машина произвела " + minute * time4 + " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte white = 2;
        byte brown = 4;
        int oneClass = white + brown;
        int totalClass = totalCans / oneClass;
        System.out.println("В школе где " + totalClass + " классов, нужно " + totalClass * white + " банок белой краски и " + totalClass * brown + " банок коричней краки.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte oneBananasGram = 80;
        short milkMl = 2;
        byte oneMilkGram = 105;
        byte ice = 2;
        byte oneIceGram = 100;
        byte egs = 4;
        byte oneEgsGram = 70;
        int totalGram = 5 * 80 + 2 * 105 + 2 * 100 + 4 * 70;
        System.out.println("Вес завтрака составляет " + totalGram + " грамм.");
        float totalKilogram = totalGram / 100f;
        System.out.println("Вес завтрака составляет " + totalKilogram + " килограмм.");
    }
    public static void task7(){
        System.out.println("Задача 7");
        byte needToReset = 7;
        short minGram = 250;
        short maxGram = 500;
        short minResult = 7 * 1000 / 250;
        System.out.println("Минимальный результат " + minResult + " дней.");
        short maxResult = 7 * 1000 / 500;
        System.out.println("Максимальный результат " + maxResult + " дней.");
        int approximately = (minResult + maxResult) / 2;
        System.out.println("Примерно потребуется " + approximately + " дней.");
    }
    public static void task8(){
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cris = 76230;
        int mashaPromotion = masha / 10;
        int denisPromotion = denis / 10;
        int crisPromotion = cris / 10;
        int mashaNow = masha + mashaPromotion;
        int denisNow = denis + denisPromotion;
        int crisNow = cris + crisPromotion;
        int mashaDifference = mashaNow * 12 - masha * 12;
        System.out.println("Маша теперь получает " + mashaNow + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        int denisDifference = denisNow * 12 - denis * 12;
        System.out.println("Денис теперь получает " + denisNow + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        int crisDeference = crisNow * 12 - cris * 12;
        System.out.println("Крис теперь получает " + crisNow + " рублей. Годовой доход вырос на " + crisDeference + " рублей.");



    }
}
