public class Main {

    public static void main(String[] args) {

        BmiService imt = new BmiService();
        int height = 180;
        int weight = 90;
        int x = imt.calculate(height, weight);
        System.out.println("Ваш индекс массы тела равен: " + x);

    }
}
