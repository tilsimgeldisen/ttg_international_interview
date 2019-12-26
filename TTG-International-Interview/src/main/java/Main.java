import java.util.List;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Main {

    //variable settings
    private static final String INPUT_FILE_TXT = "inputFile.txt";
    private static final String FOR_ANSWER_3_PLEASE_CHECK_OUTPUT_TXT_FILE = "For Answer3 Please check outputFile.txt file";
    private static final String ANSWER_2 = "Answer2: ";
    private static final String ANSWER_1 = "Answer1: ";

    /**
     * main method provides to call which question answer you would like to see
     * you can eliminate or order them and run
     * @param args
     */
    public static void main(String[] args) {
        callQuestion1();
        callQuestion2();
        callQuestion3();
    }

    /**
     * this method answers the Question 1
     */
    public static void callQuestion1() {
        Question1 q1 = new Question1();
        Integer[] array1 = {4, 12, 9, 5, 6, 1};
        Integer[] array2 = {4, 9, 12, 6};
        System.out.println(ANSWER_1);
        // calling Question 1's findMissing method
        List result1 = q1.findMissing(array1, array2);
        result1.forEach(System.out::print);

        System.out.println("");
    }

    /**
     * this method answers the Question 2
     */
    public static void callQuestion2() {
        Question2 q2 = new Question2();

        Integer[] array = {1, 2, 3, 4, 5, 6};
        int number = 1;
        System.out.println(ANSWER_2);
        // calling Question 2's rotate method
        List result2 = q2.rotate(array, number);
        result2.forEach(System.out::print);

        System.out.println("");
    }

    /**
     * this method answers the Question 3
     */
    public static void callQuestion3() {
        Question3 q3 = new Question3();

        // reading all data form inputFile.txt
        List<List<String>> dataList = q3.readFile(INPUT_FILE_TXT);
        // calling Question 3's processAndWriteFile method with dataList
        q3.processAndWriteFile(dataList);
        System.out.println(FOR_ANSWER_3_PLEASE_CHECK_OUTPUT_TXT_FILE);
    }
}
