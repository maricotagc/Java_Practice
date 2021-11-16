package mari.moita.com.Exercise5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SubOperation implements Operation{

    @Override
    public BigDecimal doCalculation(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}
