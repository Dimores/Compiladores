package ast.impl;

import ast.interfaces.*;
import designPatterns.IVisitor;

public class Number implements INumber{

    private Object value;

    public Number(Object value){
        this.value = value;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitNumber(this);
    }
    

    
}
