public class Calc {

    public double add(int a, int b) {
        return a + b;
    }

    public double add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public double square(double a) {
        return a * a;
    }
}
