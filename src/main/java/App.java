public class App {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        boolean bool = calculator.add(2, 3) == 5;
    }
}
