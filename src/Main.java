public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 70;
        double height = 1.80;
        double index = service.bms(mass, height);
        System.out.println(index);
    }
}