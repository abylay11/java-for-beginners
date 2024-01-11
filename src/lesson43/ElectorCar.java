package lesson43;

public class ElectorCar {
    private int id;
    private static boolean isCharging;

    private class Motor {
        public void startMotor() {
            System.out.printf("Motor of Elector Car #%d is starting...\n", id);
        }
    }

    public static class Battery {
        public void charge() {
            isCharging = true;
            System.out.println("Battery is charging...");
        }
    }

    public ElectorCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Elector car id " + id + " is starting...");
    }
}
