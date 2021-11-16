package mari.moita.com.Exercise5;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ComputeTest {

    @Test
    public void getResultOfSum() {

        SumOperation sumTest = new SumOperation();
        Compute computeTest = new Compute(sumTest);

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "549712924930110153329509";

        Assert.assertEquals(expectedResult, computeTest.getResultOfMathOperation(bigDecimal1, bigDecimal2).toString());
    }

    @Test
    public void getResultOfSubtraction() {

        SubOperation subTest = new SubOperation();
        Compute computeTest = new Compute(subTest);

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "541200011961180783599781";

        Assert.assertEquals(expectedResult, computeTest.getResultOfMathOperation(bigDecimal1, bigDecimal2).toString());
    }

    @Test
    public void getResultOfMultiplication() {

        MultOperation multTest = new MultOperation();
        Compute computeTest = new Compute(multTest);

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "2321711722108674421140415179650927535386733280";

        Assert.assertEquals(expectedResult, computeTest.getResultOfMathOperation(bigDecimal1, bigDecimal2).toString());
    }

    @Test
    public void getResultOfDivision() {

        DivOperation divTest = new DivOperation();
        Compute computeTest = new Compute(divTest);

        String num1 = "545456468445645468464645";
        String num2 = "4256456484464684864864";

        BigDecimal bigDecimal1 = new BigDecimal(num1);
        BigDecimal bigDecimal2 = new BigDecimal(num2);

        String expectedResult = "128.14801947029538182270";

        Assert.assertEquals(expectedResult, computeTest.getResultOfMathOperation(bigDecimal1, bigDecimal2).toString());
    }
}