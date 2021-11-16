package mari.moita.com.Exercise5;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SubOperationTest {

    @Test
    public void shouldReturnSubtractionOfTwoBigDecimals() {

        SubOperation subTest = new SubOperation();

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "541200011961180783599781";

        Assert.assertEquals(expectedResult, subTest.doCalculation(bigDecimal1, bigDecimal2).toString());
    }
}