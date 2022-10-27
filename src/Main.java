public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 71;
        int height = service.calculate(weight);
        System.out.println(height);
    }
}
