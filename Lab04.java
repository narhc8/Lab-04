import java.util.Arrays;
import java.util.Collections;

public class Lab4 {

    public static void main(String[] args) throws Exception {

        Integer[] intArrayTest1 = new Integer[] {
                2, 9, 1, 5
        };

        Integer[] intArrayTest2 = new Integer[] {
                null
        };

        Integer[] intArrayTest3 = new Integer[] {
                2, -1, 1, 5
        };

        Integer[] intArrayTest4 = new Integer[] {
                5, 4, 3, 2, 1
        };

        Integer[] intArrayTest5 = new Integer[] {
                0, 0, 0, 0
        };

        sortArray(intArrayTest1);
        sortArray(intArrayTest2);
        sortArray(intArrayTest3);
        sortArray(intArrayTest4);
        sortArray(intArrayTest5);


    }

    public static Integer[] sortArray(Integer[] intArray){


        if(intArray != null){

            Arrays.sort(intArray, Collections.reverseOrder());

            return intArray;
        }
        else {
            System.out.println("array is null");
        }

        return intArray;

    }

}