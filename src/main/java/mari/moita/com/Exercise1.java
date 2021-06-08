package mari.moita.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1
{

    public Map<String, Integer> returnsMap(List<Integer> inputList){
        Map<String, Integer> map1 = new HashMap<String, Integer>(){};
        Integer min = inputList.get(0);
        Integer max = inputList.get(0);
        Integer total = min + max;

        if (inputList == null || inputList.isEmpty()) {
            throw new IllegalArgumentException("The inputted list is null");
        }

        for (Integer elementX : inputList) {
            if (elementX < 0) {
                throw new IllegalArgumentException("The inputted list has negative values");
            }
        }

        for (Integer elementY : inputList) {
            if (elementY < min) {
                min = elementY;
            }
            if (elementY > max) {
                max = elementY;
            }
        }

        for (Map.Entry<String, Integer> entry: map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
        }

        map1.put("min", min);
        map1.put("max", max);
        map1.put("total", total);

        return map1;
    }
}
