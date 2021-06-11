package mari.moita.com;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.IsEqual.equalTo;

public class Exercise3Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnExceptionForEmptyList() {

        List<Integer> inputList = new ArrayList<>();

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUM", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The list should have, at least, one element."));

        new Exercise3().modifiedValues(inputMap, inputList);
    }

    @Test
    public void shouldReturnExceptionForNotValidOperation() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("PERCENT", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The input map doesn't have any valid operation."));

        new Exercise3().modifiedValues(inputMap, inputList);
    }

    @Test
    public void shouldReturnModifiedValuesListForSUM() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUM", 1);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);

        Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
    }

    @Test
    public void shouldReturnModifiedValuesListForMULT() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(3);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("MULT", 2);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(6);

        Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
    }

    @Test
    public void shouldReturnModifiedValuesListForDIV() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(50);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("DIV", 2);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(25);

        Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
    }

    @Test
    public void shouldReturnModifiedValuesListForSUB() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(9);
        inputList.add(5);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUB", 3);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(6);
        expectedList.add(2);

        Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
    }

    @Test
    public void shouldReturnModifiedValuesListForMultipleOperations() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUM", 2);
        inputMap.put("DIV", 2);
        inputMap.put("MULT", 2);
        inputMap.put("SUB", 2);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(8);

        Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
    }
}