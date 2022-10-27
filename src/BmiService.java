public class BmiService {
    public int calculate(int weight) {
        int height = 170;
        int bodyMassIndex = height / weight;
        return bodyMassIndex;
    }
}
