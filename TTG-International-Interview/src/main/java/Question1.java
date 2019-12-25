import java.util.*;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Question1 {

    /**
     *
     * @param array1
     * @param array2
     * @return
     */
    protected List findMissing(Integer[] array1, Integer[] array2) {

        if (array1 == null || array2 == null) {
            return Collections.EMPTY_LIST;
        }
        Set<Integer> sourceSet = new HashSet<>(Arrays.asList(array1));
        Set<Integer> targetSet = new HashSet<>(Arrays.asList(array2));
        sourceSet.removeIf(targetSet::contains);

        return new ArrayList<>(sourceSet);
    }
}
