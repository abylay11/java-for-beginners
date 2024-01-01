package lesson12;

public class Arrays_of_Strings {

    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "привет";
        strings[1] = "пока";
        strings[2] = "java";

        for (String string: strings) {
            System.out.println(string);
        }

        System.out.println();

        int[] numbers = {1, 2, 3};
        int sum = 0;

        for (int num: numbers) {
            sum += num;
        }

        System.out.println("sum: " + sum);

//        String s = null;
//        System.out.println(s);
    }

}
