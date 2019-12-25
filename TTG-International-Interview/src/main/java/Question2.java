import java.util.*;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Question2 {
    /**
     *
     * @param array
     * @param number
     * @return
     */
    protected List rotate(Integer[] array, int number) {

        if (array == null || array.length == 0) {
            return Collections.EMPTY_LIST;
        }
        number = number % array.length;
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < result.length; i++) {
            int newIndex = i - number;
            if (newIndex < 0) {
                newIndex = newIndex + result.length;
            }
            result[newIndex] = array[i];
        }
        return Arrays.asList(result);
    }
}
