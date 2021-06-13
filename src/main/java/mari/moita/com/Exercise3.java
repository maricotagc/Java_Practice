package mari.moita.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise3 {

    public List<Integer> modifiedValues(Map<String, Integer> inputMap, List<Integer> inputList) throws Exception {

        if (inputList == null || inputList == null) {
            throw new IllegalArgumentException("The list/map cannot be null.");
        }

        if (inputList.isEmpty()) {
            throw new IllegalArgumentException("The list should have, at least, one element.");
        }

        if (!(inputMap.containsKey("SUM") || inputMap.containsKey("MULT") || inputMap.containsKey("DIV") || inputMap.containsKey("SUB"))) {
            throw new IllegalArgumentException("The input map doesn't have any valid operation.");
        }

        List<Integer> modifiedValues = new ArrayList<>();
        
        for (int i = 0; i < inputList.size(); i++) {
            int result = inputList.get(i);

            for (String key : inputMap.keySet()) {
                switch (key) {
                    case "SUM":
                        result = result + inputMap.get(key);
                        break;
                    case "MULT":
                        result = result * inputMap.get(key);
                    break;
                    case "DIV":
                        if (inputMap.get(key) == 0) {
                            throw new Exception("This list contains a combination which results in a number divided by 0.");
                        } else
                        result = result / inputMap.get(key);
                    break;
                    case "SUB":
                        result = result - inputMap.get(key);
                    break;
                }
            }
            modifiedValues.add(result);
        }
        return modifiedValues;
    }

    public static void main(String[] args) {
        System.out.println(1/0);
    }

    //TODO: order of loop inside the switch
}
