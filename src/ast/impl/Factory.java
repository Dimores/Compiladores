package ast.impl;

import ast.interfaces.*;

public class Factory implements designPatterns.IFactory {

    public Factory() {
    }

    @Override
    public INumber createNumber(Object number){
        return new Number(number);
    }

    @Override
    public IUnaryOperation createUnaryOperation(int code, IExpression operand) {
        return new UnaryOperation(code, operand);
    }

    @Override
    public ast.interfaces.IBinaryOperation createBinaryOperation(int code, IExpression operand1, IExpression operand2) {
        return new BinaryOperation(code, operand1, operand2);
    }


}
