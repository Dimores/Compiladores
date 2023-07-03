package designPatterns;

import ast.interfaces.IBinaryOperation;
import ast.interfaces.IExpression;
import ast.interfaces.IIntegerNumber;
import ast.interfaces.INumber;
import ast.interfaces.IUnaryOperation;

public interface IFactory {
	
    INumber createNumber(Object number);
    IUnaryOperation createUnaryOperation(int code, IExpression operand);
    IBinaryOperation createBinaryOperation(int code, IExpression operand1, IExpression operand2);

}
