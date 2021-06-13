package mari.moita.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Exercise3 {

    public List<Integer> modifiedValues(Map<String, Integer> inputMap, List<Integer> inputList) throws Exception{

        if (inputList == null || inputMap == null) {
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

            if (inputMap.containsKey("SUM")) {
                int result = inputList.get(i);
                result = result + inputMap.get("SUM");
                modifiedValues.add(result);
            }
            if (inputMap.containsKey("MULT")) {
                int result = inputList.get(i);
                result = result * inputMap.get("MULT");
                modifiedValues.add(result);
            }
            if (inputMap.containsKey("DIV")) {
                int result = inputList.get(i);
                if (inputMap.get("DIV") == 0) {
                    throw new Exception("This map contains DIV as zero which is not a valid operation.");
                } else {
                    result = result / inputMap.get("DIV");
                    modifiedValues.add(result);
                }
            }
            if (inputMap.containsKey("SUB")) {
                int result = inputList.get(i);
                result = result - inputMap.get("SUB");
                modifiedValues.add(result);
            }
        }

//        if (inputMap.containsKey("SUM")) {
//            for (int i = 0; i < inputList.size(); i++) {
//                int result = inputList.get(i);
//                result = result + inputMap.get("SUM");
//                modifiedValues.add(result);
//            }
//        }
//
//        if (inputMap.containsKey("MULT")) {
//            for (int i = 0; i < inputList.size(); i++) {
//                int result = inputList.get(i);
//                result = result * inputMap.get("MULT");
//                modifiedValues.add(result);
//            }
//        }
//
//        if (inputMap.containsKey("DIV")) {
//            for (int i = 0; i < inputList.size(); i++) {
//                int result = inputList.get(i);
//
//                if (inputMap.get("DIV") == 0) {
//                    throw new Exception("This map contains DIV as zero which is not a valid operation.");
//                } else {
//                    result = result / inputMap.get("DIV");
//                    modifiedValues.add(result);
//                }
//            }
//        }
//
//        if (inputMap.containsKey("SUB")) {
//            for (int i = 0; i < inputList.size(); i++) {
//                int result = inputList.get(i);
//                result = result - inputMap.get("SUB");
//                modifiedValues.add(result);
//            }
//        }

        return modifiedValues;
    }
}
