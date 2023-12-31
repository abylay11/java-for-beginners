package lesson9;

public class Break_Continue {

    public static void main(String[] args) {
        int value = 0;
        while (true) {
            if (value == 5)
                break;

            System.out.println("Value: " + value);

            value++;
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println("i: " + i);
        }
    }

}
