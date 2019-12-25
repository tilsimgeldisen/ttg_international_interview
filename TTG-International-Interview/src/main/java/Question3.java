import java.io.*;
import java.util.*;

/**
 * @author tilsimgeldisencakiroglu
 */
public class Question3 {

    private static final String OUTPUT_FILE_TXT = "outputFile.txt";
    private static final String INVALID_INPUT_FILE_FORMAT = "Invalid Input File Format";

    /**
     *
     * @param fileName
     * @return
     */
    protected List<List<String>> readFile(String fileName) {
        List<List<String>> listOfList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream(String.format("%s%s","/" ,fileName)), "UTF-8"));
            String line;

            int t;
            int n;
            int index = 0;
            int controlIndex = 1;
            List<String> accountList = null;

            while ((line = br.readLine()) != null) {

                if (index != 0 && index != controlIndex && line.trim().length() != 0) {
                    accountList.add(line);
                }
                if (index == 0) {
                    t = Integer.parseInt(line);
                    if(t>5){
                        throw new Exception(INVALID_INPUT_FILE_FORMAT);
                    }
                }

                if (index == controlIndex) {
                    n = Integer.parseInt(line);
                    if(n>100000){
                        throw new Exception(INVALID_INPUT_FILE_FORMAT);
                    }
                    controlIndex = n + index + 2;
                    accountList = new ArrayList<>();
                    listOfList.add(accountList);
                }
                index++;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listOfList;
    }

    /**
     *
     * @param dataList
     */
    protected void processAndWriteFile(List<List<String>> dataList) {

        List<ElementCountDto> list = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            sortAndDistinctList(dataList.get(i), list);
        }
        writeFile(list);
    }

    /**
     *
     * @param list
     * @param elementCountDtoList
     */
    private void sortAndDistinctList(List<String> list, List<ElementCountDto> elementCountDtoList) {
        Collections.sort(list);
        Map<String, Integer> elementAndCount = new LinkedHashMap<>();
        for (String element : list) {
            Integer count = elementAndCount.get(element);
            if (count == null) {
                elementAndCount.put(element, 1);
            } else {
                elementAndCount.put(element, ++count);

            }
        }
        for (Map.Entry<String, Integer> set : elementAndCount.entrySet()) {
            elementCountDtoList.add(new ElementCountDto(set.getKey(), set.getValue()));
        }
        elementCountDtoList.add(null);
    }

    /**
     *
     * @param list
     */
    private void writeFile(List<ElementCountDto> list) {
        try (FileWriter writer = new FileWriter(OUTPUT_FILE_TXT);
             BufferedWriter bw = new BufferedWriter(writer)) {
            for (ElementCountDto elementCountDto : list) {
                if (elementCountDto == null) {
                    bw.write("");
                    bw.newLine();
                } else {
                    bw.write(String.format("%s %d", elementCountDto.getElement(), elementCountDto.getCount()));
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
