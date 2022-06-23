public class BmiService {
    public double calculate(double mass, double mansHeight) {
        double index = mass / mansHeight / mansHeight;
        return index;
    }
}