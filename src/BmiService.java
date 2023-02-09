public class BmiService {

    public double bms(int mass, double height) {
        double index = mass / (height * height);
        return index;
    }
}
