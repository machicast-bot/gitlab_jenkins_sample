public class Main {

    public static final Double TAX_RATE = 1.08;

    public static int calc(int price) {
        return new Double(Math.floor(price * TAX_RATE)).intValue();
    }
}
