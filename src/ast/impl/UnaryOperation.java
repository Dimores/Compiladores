package ast.impl;

import designPatterns.IVisitor;
import ast.interfaces.*;

public class UnaryOperation
        extends Operation
        implements IUnaryOperation {

    private IExpression operand;

    public UnaryOperation(int code, IExpression operand) {
        super(code);
        this.operand = operand;
    }

    public IExpression getOperand() {
        return operand;
    }

    public void accept(IVisitor visitor) {
        visitor.visitUnaryOperation(this);        
    }

}
