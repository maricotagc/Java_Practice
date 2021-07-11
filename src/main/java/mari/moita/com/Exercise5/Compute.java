package mari.moita.com.Exercise5;

import java.math.BigDecimal;

public class Compute {

    private Operation operation = null;

    public Compute(Operation operation) {
        this.operation = operation;
    }

    public BigDecimal getResultOfMathOperation(BigDecimal num1, BigDecimal num2) {
        return operation.doCalculation(num1, num2);
    }
}
