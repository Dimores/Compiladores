package designPatterns;

import ast.interfaces.*;

public interface IVisitor {

    void visitBinaryOperation(IOperation operation);
    void visitIntegerNumber(IIntegerNumber integerNumber);
    void visitDoubleNumber(IDoubleNumber doubleNumber);
    void visitNumber(INumber number);
    void visitUnaryOperation(IOperation operation);

}
