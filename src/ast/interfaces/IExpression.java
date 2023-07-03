package ast.interfaces;

import designPatterns.IVisitor;

public interface IExpression {

    void accept(IVisitor visitor);

}
