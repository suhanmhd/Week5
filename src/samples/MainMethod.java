package samples;

public class MainMethod {
    public static void main(String[] args) {
        Car audiCar = new Car() {
            @Override
            public void applyBreak() {
                System.out.println("apply break");
            }
        };
        audiCar.applyBreak();
    }
}
