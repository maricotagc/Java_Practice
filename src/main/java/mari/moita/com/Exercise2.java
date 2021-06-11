package mari.moita.com;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public List<Integer> generatesListOfIntegers(List<String> inputList1, List<String> inputList2) {

        if (inputList1 == null || inputList1.isEmpty() || inputList2 == null || inputList2.isEmpty()) {
            throw new IllegalArgumentException("The inputted list is either null or empty");
        }

        if (inputList1.size() != inputList2.size()) {
            throw new IllegalArgumentException("Both inputted lists must have the same number of elements");
        }

        List<Integer> integerListGenerated = new ArrayList<>();

        for (int i = 0; i <= inputList1.size() - 1; i++) {
            int totalWordCount = (inputList1.get(i).length()) + (inputList2.get(i).length());
            integerListGenerated.add(totalWordCount);
        }

        return integerListGenerated;
    }
}
