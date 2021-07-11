package mari.moita.com.Exercise5;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SumOperationTest {

    @Test
    public void shouldReturnSumOfTwoBigDecimals() {

        SumOperation sumTest = new SumOperation();

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "549712924930110153329509";

        Assert.assertEquals(expectedResult, sumTest.doCalculation(bigDecimal1, bigDecimal2).toString());
    }
}