public class App {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        int b = 2;
        System.out.println(calculator.add(2, 3) == 5);
    }
}
