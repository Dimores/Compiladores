package ast.impl;

import designPatterns.IVisitor;
import ast.interfaces.*;

public class BinaryOperation
        extends Operation
        implements IBinaryOperation {

    private IExpression operand1, operand2;

    public BinaryOperation(int code, IExpression operand1, IExpression operand2) {
        super(code);
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public IExpression getOperand1() {
        return operand1;
    }

    public IExpression getOperand2() {
        return operand2;
    }

    public void accept(IVisitor visitor) {
        visitor.visitBinaryOperation(this);
    }

}
