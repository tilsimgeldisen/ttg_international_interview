import java.util.*;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Question2 {
    /**
     *  rotate that takes an array and a number
     *  then returns the left rotated array by positions.
     * @param array
     * @param number
     * @return left rotated list
     */
    protected List rotate(Integer[] array, int number) {

        //array null check
        if (array == null || array.length == 0) {
            return Collections.EMPTY_LIST;
        }

        //taking the mod of number given in case of rotating many times
        number = number % array.length;
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < result.length; i++) {
            int newIndex = i - number;
            if (newIndex < 0) {
                newIndex = newIndex + result.length;
            }
            // putting  new positions into new integer array
            result[newIndex] = array[i];
        }
        return Arrays.asList(result);
    }
}
