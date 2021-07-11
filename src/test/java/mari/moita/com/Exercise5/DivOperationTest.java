package mari.moita.com.Exercise5;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DivOperationTest {

    @Test
    public void shouldReturnDivisionOfTwoBigDecimals() {

        DivOperation divOperation = new DivOperation();

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "128.14801947029538182270";

        Assert.assertEquals(expectedResult, divOperation.doCalculation(bigDecimal1, bigDecimal2).toString());
    }
}