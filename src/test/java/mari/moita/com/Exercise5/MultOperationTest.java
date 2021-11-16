package mari.moita.com.Exercise5;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MultOperationTest {

    @Test
    public void shouldReturnMultiplicationOfTwoBigDecimals() {

        MultOperation multiplicationTest = new MultOperation();

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "2321711722108674421140415179650927535386733280";

        Assert.assertEquals(expectedResult, multiplicationTest.doCalculation(bigDecimal1, bigDecimal2).toString());
    }
}