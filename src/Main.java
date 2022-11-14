public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 71;
        double height = 210;
        double index = service.calculate(weight, height);
        String massIndex = String.format("%.2f", index);


        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height + " см.");
        System.out.println("Ваш индекс массы: " + massIndex);
    }
}


