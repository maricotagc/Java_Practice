package mari.moita.com;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.IsEqual.equalTo;

public class Exercise1Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnTotal() {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);

        Map<String, Integer> resultMap = new Exercise1().returnsMap(inputList);

        Assert.assertEquals(6, (int) resultMap.get("total"));
    }

    @Test
    public void shouldReturnMin() {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);

        Map<String, Integer> resultMap = new Exercise1().returnsMap(inputList);

        Assert.assertEquals(1, (int) resultMap.get("min"));
    }

    @Test
    public void shouldReturnMax() {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);

        Map<String, Integer> resultMap = new Exercise1().returnsMap(inputList);

        Assert.assertEquals(3, (int) resultMap.get("max"));
    }

    @Test
    public void shouldReturnIllegalExceptionForEmptyList() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list is either null or empty"));
        new Exercise1().returnsMap(new ArrayList<Integer>());
    }

    @Test
    public void shouldReturnIllegalExceptionForNullList() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list is either null or empty"));
        new Exercise1().returnsMap(null);
    }

    @Test
    public void shouldReturnIllegalExceptionForNegativeList() {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(-1);
        inputList.add(-2);
        inputList.add(-3);

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list has negative values"));
        new Exercise1().returnsMap(inputList);
    }
}