package main;

import designPatterns.IVisitor;
import java.io.PrintStream;
import parser.sym;
import ast.interfaces.*;

public class PrinterVisitor
        implements IVisitor {

    private PrintStream out;

    public PrinterVisitor(PrintStream out) {
        this.out = out;
    }

    @Override
    public void visitIntegerNumber(IIntegerNumber inteiro) {
        out.print(inteiro.getValue());
    }
    
    @Override
    public void visitDoubleNumber(IDoubleNumber doubleNumber){
        out.print(doubleNumber.getValue());
    }
    
    @Override
    public void visitNumber(INumber number){
        out.print(number.getValue());
    }

    @Override
    public void visitBinaryOperation(IOperation operation) {
        out.print("(");
        IBinaryOperation binOp = (IBinaryOperation) operation;
        IExpression op1 = binOp.getOperand1();

        if (op1 != null) {
            op1.accept(this);
        }
        out.print(codeToString(operation.getCode()));
        IExpression op2 = binOp.getOperand2();
        if (op2 != null) {
            op2.accept(this);
        }

        out.print(")");
        
    }

    @Override
    public void visitUnaryOperation(IOperation operation) {

        out.print("(" + codeToString(operation.getCode()));
           
        IUnaryOperation binOp = (IUnaryOperation) operation;
        IExpression op1 = binOp.getOperand();

        if (op1 != null) {
            op1.accept(this);
        }
         out.print(")");

    }
    
    public String codeToString(int code) {
        String s = "";
        switch (code) {
            case sym.DIV:
                s = "/";
                break;
            case sym.MAIS:
                s = "+";
                break;
            case sym.MENOS:
                s = "-";
                break;
            case sym.MULT:
                s = "*";
                break;
        }
        return s;
    }
    
    public String codeToStringExcel(int code) {
        String s = "";
        switch (code) {
            case sym.DIV:
                s = "Div(";
                break;
            case sym.MAIS:
                s = "Sum(";
                break;
            case sym.MENOS:
                s = "Sub(";
                break;
            case sym.MULT:
                s = "Mult(";
                break;
        }
        return s;
    }
}
