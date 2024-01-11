package lesson43;

public class Test {
    public static void main(String[] args) {
        ElectorCar electorCar = new ElectorCar(1);
        electorCar.start();

        ElectorCar.Battery battery = new ElectorCar.Battery();
        battery.charge();
    }
}
