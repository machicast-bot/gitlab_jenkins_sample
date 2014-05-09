public class Main {

    public static final Double TAX_RATE = 1.05;

    public static int calc(int price) {
        return new Double(Math.floor(price * TAX_RATE)).intValue();
    }
}
