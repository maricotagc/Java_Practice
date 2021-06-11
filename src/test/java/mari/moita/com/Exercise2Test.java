package mari.moita.com;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

public class Exercise2Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnExceptionForNullLists() {

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list is either null or empty"));

        new Exercise2().generatesListOfIntegers(null, null);
    }

    @Test
    public void shouldReturnExceptionForOneEmptyList() {

        List<String> inputList1 = new ArrayList<String>() {};
        List<String> inputList2 = new ArrayList<String>() {};
        inputList2.add("Mariana");

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list is either null or empty"));

        new Exercise2().generatesListOfIntegers(inputList1, inputList2);
    }

    @Test
    public void shouldReturnExceptionForTwoEmptyLists() {

        List<String> inputList1 = new ArrayList<String>() {};
        List<String> inputList2 = new ArrayList<String>() {};

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The inputted list is either null or empty"));

        new Exercise2().generatesListOfIntegers(inputList1, inputList2);
    }

    @Test
    public void shouldReturnExceptionForListsWithDifferentSizes() {

        List<String> inputList1 = new ArrayList<String>() {};
        inputList1.add("Mariana");
        inputList1.add("Mariana");

        List<String> inputList2 = new ArrayList<String>() {};
        inputList2.add("Mariana");

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("Both inputted lists must have the same number of elements"));

        new Exercise2().generatesListOfIntegers(inputList1, inputList2);
    }

    @Test
    public void shouldReturnListOfIntegers(){

        List<String> inputList1 = new ArrayList<String>() {};
        inputList1.add("Um");
        inputList1.add("Dois");

        List<String> inputList2 = new ArrayList<String>() {};
        inputList2.add("Um");
        inputList2.add("Dois");

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(4);
        expectedList.add(8);

        Assert.assertEquals(expectedList, new Exercise2().generatesListOfIntegers(inputList1, inputList2));
    }
}