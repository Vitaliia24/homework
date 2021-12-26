package ru.skypro;

public class Main {

    public static void main(String[] args) {
        byte a = 24;
        short b = 200;
        int c = 50_000;
        long d = 89_564_456_321L;

        float e = 4.4563f;
        double k = 7.656565444458;

        char j = 'X';

        boolean g = false;


        float z = 78.2f;
        float q = 82.7f;

        System.out.println("Общий вес" + (z + q));
        System.out.println("Разница в весе" + Math.abs(z - q));


        int bananaWeight = 80;
        int bananaAmount = 5;

        int milkWeight = 105;
        int milkAmount = 2;

        int iceWeight = 100;
        int iceAmount = 2;

        int eggWeight = 70;
        int eggAmount = 4;

        int result = bananaWeight * bananaAmount +
                milkWeight * milkAmount + iceWeight * iceAmount
                + eggWeight * eggAmount;

        System.out.println("Вес коктейля в граммах" + result);

        float resultInKg = result / 1000;
        System.out.println("Вес коктейля в килограммах" + resultInKg);




        int minusKg = 7;

        int grammInKg = 1000;

        int minusGramm = minusKg * grammInKg;

        int minGrammInDay = 250;
        int maxGrammInDay = 500;

        int minDays = minusGramm / maxGrammInDay;
        int maxDays = minusGramm / minGrammInDay;

        int avg = (minDays + maxDays) / 2;
        System.out.println("Минимальное количество дней" + minDays);
        System.out.println("Максимальное количество дней" + maxDays);
        System.out.println("Среднее число дней" + avg);





        float mashaZp = 67_760;
        float denisZp = 83_690;
        float kristinaZp = 76_230;

        float mashaNewZp = mashaZp + (mashaZp * 0.1);
        float mashaRaznicaZp = mashaNewZp - mashaZp;

        float denisNewZp = denisZp + (denisZp * 0.1);
        float denisRaznicaZp = denisNewZp - denisZp;

        float kristinaNewZp = kristinaZp + (kristinaZp * 0.1);
        float kristinaRaznicaZp = kristinaNewZp - kristinaZp;

        System.out.println("Маша теперь получает" + mashaNewZp + "." +
                "Годовой доход вырос на" + mashaRaznicaZp + "рублей.");
        System.out.println("Денис теперь получает" + denisNewZp + "." +
                "Годовой доход вырос на" + denisRaznicaZp + "рублей.");
        System.out.println("Кристина теперь получает" + kristinaNewZp + "." +
                "Годовой доход вырос на" + kristinaRaznicaZp + "рублей.");





    }
}
