public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 75.0; // масса тела (кг)
        double mansHeight = 1.75; // рост (м)
        double index = service.calculate(mass, mansHeight);
        System.out.println(index);
    }
}