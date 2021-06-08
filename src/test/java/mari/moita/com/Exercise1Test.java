package mari.moita.com;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    //TODO: verify return and create assert
    public void shouldReturnMap() {
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(0,1);
        inputList.add(1, 2);
        inputList.add(2, 3);
        Exercise1 test = new Exercise1();
        test.returnsMap(inputList);
    }

    //TODO: verify return and create assert
    public void shouldReturnIllegalExceptionForEmptyList() {
        List<Integer> inputList = new ArrayList<Integer>();
        Exercise1 test = new Exercise1();
        test.returnsMap(inputList);
    }

    //TODO: verify how to emulate null list and create assert
    public void shouldReturnIllegalExceptionForNullList() {
        List<?> inputList = null;
        Exercise1 test = new Exercise1();
//        test.returnsMap(inputList);
    }
}