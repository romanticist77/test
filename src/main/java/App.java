public class App {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        int a = 1;
        System.out.println(calculator.add(22, 33) == 55);
    }
}
