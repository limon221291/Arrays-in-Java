public class Java_Multidimensional_Arrays {
    public static void main(String[] args) {

        // 2D array:
        System.out.println("2D array:");
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print (a[i][j]+"   ");
            }
            System.out.println();
        }

        // initialization and declaration are same as 1D arrays !
        // Suppose you want to declare and initialize 3D array, so steps will be same as below:
        System.out.println("3D array: ");
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }

    }
}
