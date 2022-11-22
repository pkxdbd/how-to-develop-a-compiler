package org.pkx.entity;
import org.pkx.type.Type;
import org.pkx.ast.TypeNode;
import org.pkx.ast.ExprNode;
import org.pkx.ir.Expr;
import org.pkx.asm.Symbol;
import org.pkx.asm.NamedSymbol;

public class DefinedVariable extends Variable {
    protected ExprNode initializer;
    protected Expr ir;
    protected long sequence;
    protected Symbol symbol;

    public DefinedVariable(boolean priv, TypeNode type,
                           String name, ExprNode init) {
        super(priv, type, name);
        initializer = init;
        sequence = -1;
    }

    static private long tmpSeq = 0;

    static public DefinedVariable tmp(Type t) {
        return new DefinedVariable(false,
                new TypeNode(t), "@tmp" + tmpSeq++, null);
    }

    public boolean isDefined() {
        return true;
    }

    public void setSequence(long seq) {
        this.sequence = seq;
    }

    public String symbolString() {
        return (sequence < 0) ? name : (name + "." + sequence);
    }

    public boolean hasInitializer() {
        return (initializer != null);
    }

    public boolean isInitialized() {
        return hasInitializer();
    }

    public ExprNode initializer() {
        return initializer;
    }

    public void setInitializer(ExprNode expr) {
        this.initializer = expr;
    }

    public void setIR(Expr expr) {
        this.ir = expr;
    }

    public Expr ir() { return ir; }

    protected void _dump(org.pkx.ast.Dumper d) {
        d.printMember("name", name);
        d.printMember("isPrivate", isPrivate);
        d.printMember("typeNode", typeNode);
        d.printMember("initializer", initializer);
    }

    public <T> T accept(EntityVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
