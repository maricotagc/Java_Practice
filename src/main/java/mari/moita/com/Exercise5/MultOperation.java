package mari.moita.com.Exercise5;

import java.math.BigDecimal;

public class MultOperation implements Operation{

    @Override
    public BigDecimal doCalculation(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
