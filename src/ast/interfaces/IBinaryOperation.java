package ast.interfaces;

public interface IBinaryOperation extends IOperation {

    IExpression getOperand1();
    IExpression getOperand2();

}
