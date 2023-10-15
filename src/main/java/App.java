public class App {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        int a = 2;
        int c = 4;
        System.out.println(calculator.add(2, 3) == 5);
    }
}
