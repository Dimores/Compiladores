package ast.impl;

import ast.interfaces.IOperation;

public abstract class Operation
        implements IOperation {

    private int code;

    public Operation(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
