package sharpen.core.csharp.ast;

import java.util.List;

public class CSLambdaExpression extends CSExpression {
    private List<CSVariableDeclaration> args;
    private CSNode body;

    public CSLambdaExpression(List<CSVariableDeclaration> args, CSNode body) {
        this.args = args;
        this.body = body;
    }

    public List<CSVariableDeclaration> getArgs() {
        return args;
    }

    public CSNode getBody() {
        return body;
    }

    @Override public void accept(CSVisitor visitor) {
        visitor.visit(this);
    }
}
