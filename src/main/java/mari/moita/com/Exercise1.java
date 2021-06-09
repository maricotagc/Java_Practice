package mari.moita.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1
{

    public Map<String, Integer> returnsMap(List<Integer> inputList){

        if (inputList == null || inputList.isEmpty()) {
            throw new IllegalArgumentException("The inputted list is either null or empty");
        }

        for (Integer elementX : inputList) {
            if (elementX < 0) {
                throw new IllegalArgumentException("The inputted list has negative values");
            }
        }

        Integer min = inputList.get(0);
        Integer max = inputList.get(0);
        Integer total = 0;

        for (Integer elementY : inputList) {
            if (elementY < min) {
                min = elementY;
            }
            if (elementY > max) {
                max = elementY;
            }
            total = total + elementY;
        }

        Map<String, Integer> map1 = new HashMap<String, Integer>(){};

        map1.put("min", min);
        map1.put("max", max);
        map1.put("total", total);

        return map1;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(0,1);
        inputList.add(1, 2);
        inputList.add(2, 3);
        Exercise1 test = new Exercise1();
        Map<String, Integer> returnedMap = test.returnsMap(inputList);
        System.out.println(returnedMap);
        System.out.println(returnedMap.keySet());
        System.out.println(returnedMap.entrySet());
        System.out.println(returnedMap.values());
        System.out.println(returnedMap.get("total"));
    }
}
