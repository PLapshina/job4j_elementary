package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in;
        float expected;
        float out;
        boolean passed;

        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        in = 140f;
        expected = 2f;
        out = Converter.rubleToEuro(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");

        in = 140f;
        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed);
    }
}
