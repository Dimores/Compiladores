package ast.impl;

import ast.interfaces.*;
import designPatterns.IVisitor;

public class DoubleNumber 
        extends Number{
    
    private double value;

    public DoubleNumber(Object value) {
        super(value);
        this.value = (double) value;
    }
    

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitDoubleNumber((IDoubleNumber) this);
    }
    
    
}
