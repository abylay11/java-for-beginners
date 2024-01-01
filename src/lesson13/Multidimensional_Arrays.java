package lesson13;

public class Multidimensional_Arrays {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[1][1] + "\n");

        for (int[] i: matrix) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
