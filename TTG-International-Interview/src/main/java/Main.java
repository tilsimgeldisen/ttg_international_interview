import java.util.List;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Main {

    private static final String INPUT_FILE_TXT = "inputFile.txt";
    private static final String FOR_ANSWER_3_PLEASE_CHECK_OUTPUT_TXT_FILE = "For Answer3 Please check outputFile.txt file";
    private static final String ANSWER_2 = "Answer2: ";
    private static final String ANSWER_1 = "Answer1: ";

    /**
     *main function 
     * @param args
     */
    public static void main(String[] args) {
        callQuestion1();
        callQuestion2();
        callQuestion3();
    }

    /**
     *
     */
    public static void callQuestion1() {
        Question1 q1 = new Question1();
        Integer[] array1 = {4, 12, 9, 5, 6, 1};
        Integer[] array2 = {4, 9, 12, 6};
        System.out.println(ANSWER_1);
        List result1 = q1.findMissing(array1, array2);
        result1.forEach(System.out::print);

        System.out.println("");
    }

    /**
     *
     */
    public static void callQuestion2() {
        Question2 q2 = new Question2();

        Integer[] array = {1, 2, 3, 4, 5, 6};
        int number = 1;
        System.out.println(ANSWER_2);
        List result2 = q2.rotate(array, number);
        result2.forEach(System.out::print);

        System.out.println("");
    }

    /**
     *
     */
    public static void callQuestion3() {
        Question3 q3 = new Question3();

        List<List<String>> dataList = q3.readFile(INPUT_FILE_TXT);
        q3.processAndWriteFile(dataList);
        System.out.println(FOR_ANSWER_3_PLEASE_CHECK_OUTPUT_TXT_FILE);
    }
}
