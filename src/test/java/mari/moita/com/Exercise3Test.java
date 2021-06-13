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
    public void shouldReturnExceptionForNullListAndMap() throws Exception {

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The list/map cannot be null."));

        new Exercise3().modifiedValues(null, null);
    }

    @Test
    public void shouldReturnExceptionForNullList() throws Exception {

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUM", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The list/map cannot be null."));

        new Exercise3().modifiedValues(inputMap, null);
    }

    @Test
    public void shouldReturnExceptionForNullMap() throws Exception {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The list/map cannot be null."));

        new Exercise3().modifiedValues(null, inputList);
    }

    @Test
    public void shouldReturnExceptionForEmptyList() throws Exception {

        List<Integer> inputList = new ArrayList<>();

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("SUM", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The list should have, at least, one element."));

        new Exercise3().modifiedValues(inputMap, inputList);
    }

    @Test
    public void shouldReturnExceptionForNotValidOperation() throws Exception {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("PERCENT", 1);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The input map doesn't have any valid operation."));

        new Exercise3().modifiedValues(inputMap, inputList);
    }

    @Test
    public void shouldReturnModifiedValuesListForSUM() throws Exception {

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

        try {
            Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

        try {
            Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnExceptionForDIVByZero() {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(50);

        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("DIV", 0);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(25);

        try {
            Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

        try {
            Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        expectedList.add(12);
        expectedList.add(20);
        expectedList.add(5);
        expectedList.add(8);

        try {
            Assert.assertEquals(expectedList, new Exercise3().modifiedValues(inputMap, inputList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}