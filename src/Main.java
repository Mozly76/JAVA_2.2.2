public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 75.0;
        double mansHeight = 1.75;
        double index = service.calculate(mass, mansHeight);
        System.out.println(index);
    }
}