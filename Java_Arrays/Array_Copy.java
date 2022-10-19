import java.util.*;

public class Array_Copy {
    public static void main(String[] args) {
        //Copying Arrays Using Assignment Operator

        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        // change value of first element of the array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }



        //  Using Looping Construct to Copy Arrays

        System.out.println();

        int [] source = {1, 2, 3, 4, 5, 6};
        int [] destination = new int[6];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
        // converting array to string
        System.out.println(Arrays.toString(destination));




//        Copying Arrays Using arraycopy() method
        int[] n1 = {2, 3, 12, 4, 12, -2};

        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];

        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));

        // copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));




        //Copying Arrays Using copyOfRange() method
        int[] source1 = {2, 3, 12, 4, 12, -2};

        // copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source1, 0, source1.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        // copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));



//        Copying 2d Arrays Using Loop
        int[][] source3 = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };

        int[][] destination3 = new int[source3.length][];

        for (int i = 0; i < destination3.length; ++i) {

            // allocating space for each row of destination array
            destination3[i] = new int[source3[i].length];

            for (int j = 0; j < destination3[i].length; ++j) {
                destination3[i][j] = source3[i][j];
            }
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination3));

    }
}
