public class App {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.add(12, 3) == 15);
    }
}
