import java.util.Scanner;
import java.util.Arrays;

public class Java_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Local initialization:
        System.out.println("Local initialization: ");
        int[] age={12,4,5,2,5};
        for(int i=0;i<age.length;i++){    // age.length refers to size of age array
            System.out.println(age[i]);
        }


        // manual initialization & access:
        System.out.println("\nManual initialization: ");
        int[] numbers=new int[5];  // new int[5] means a memory has been allocated for this array with a size of 5

        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=0;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);


        // Input from user:
//        System.out.println("\nInput by user: ");
//        int[] arr=new int[10];
//        for(int i=0;i<10;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<10;i++){
//            System.out.print(arr[i]+"   ");
//        }


        // array sorting in java:

        System.out.println("Sorted Array:");
        int[] a={1,100,4,67,8,6};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }





    }
}
