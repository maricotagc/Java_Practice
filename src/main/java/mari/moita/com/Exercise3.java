package mari.moita.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Exercise3 {

    static final String SUM = "SUM";
    static final String MULT = "MULT";
    static final String DIV = "DIV";
    static final String SUB = "SUB";

    public List<Integer> modifiedValues(Map<String, Integer> inputMap, List<Integer> inputList) throws Exception{

        if (inputList == null || inputMap == null) {
            throw new IllegalArgumentException("The list/map cannot be null.");
        }

        if (inputList.isEmpty()) {
            throw new IllegalArgumentException("The list should have, at least, one element.");
        }

        if (!(inputMap.containsKey(SUM) || inputMap.containsKey(MULT) || inputMap.containsKey(DIV) || inputMap.containsKey("SUB"))) {
            throw new IllegalArgumentException("The input map doesn't have any valid operation.");
        }

        List<Integer> modifiedValues = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {

            int result = inputList.get(i);

            if (inputMap.containsKey(SUM)) {
                result = result + inputMap.get(SUM);
            }
            if (inputMap.containsKey(MULT)) {
                result = result * inputMap.get(MULT);
            }
            if (inputMap.containsKey(DIV)) {
                if (inputMap.get(DIV) == 0) {
                    throw new Exception("This map contains DIV as zero which is not a valid operation.");
                }
                    result = result / inputMap.get(DIV);
            }
            if (inputMap.containsKey(SUB)) {
                result = result - inputMap.get(SUB);
            }
            modifiedValues.add(result);
        }
        return modifiedValues;
    }
}
