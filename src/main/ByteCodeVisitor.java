package main;

import java.io.PrintStream;
import parser.sym;
import ast.interfaces.*;
import designPatterns.IVisitor;

public class ByteCodeVisitor
        implements IVisitor {

    private PrintStream out;

    public ByteCodeVisitor(PrintStream out) {
        this.out = out;
    }

    @Override
    public void visitIntegerNumber(IIntegerNumber inteiro) {
        out.println("BIPUSH_" + inteiro.getValue());
    }

    @Override
    public void visitDoubleNumber(IDoubleNumber doubleNumber) {
        out.println("BIPUSH_" + doubleNumber.getValue());
    }
        
    @Override
    public void visitNumber(INumber number) {
        out.println("BIPUSH_" + number.getValue());
    }

    @Override
    public void visitBinaryOperation(IOperation operation) {        
        IBinaryOperation binOp = (IBinaryOperation) operation;
        IExpression op1 = binOp.getOperand1();

        if (op1 != null) {
            op1.accept(this);
        }

        IExpression op2 = binOp.getOperand2();
        if (op2 != null) {
            op2.accept(this);
        }

        out.println(codeToString(operation.getCode()));        
    }

    @Override
    public void visitUnaryOperation(IOperation operation) {

        IUnaryOperation binOp = (IUnaryOperation) operation;
        IExpression op1 = binOp.getOperand();

        if (op1 != null) {
            op1.accept(this);
        }
        
        out.println(codeToString(operation.getCode()));
    }

    
    private String codeToString(int code) {
        String s = "";
        switch (code) {
            case sym.DIV:
                s = "idiv";
                break;
            case sym.MAIS:
                s = "iadd";
                break;
            case sym.MENOS:
                s = "isub";
                break;
            case sym.MULT:
                s = "imult";
                break;
        }
        return s;
    }
    
}
