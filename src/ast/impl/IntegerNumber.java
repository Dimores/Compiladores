package ast.impl;

import designPatterns.IVisitor;
import ast.interfaces.*;

public class IntegerNumber
        extends Number {

    private int value;

    public IntegerNumber(Object value) {
        super(value);
        this.value = (int) value;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitIntegerNumber((IIntegerNumber) this);
    }

}

