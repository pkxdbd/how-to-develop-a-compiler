package org.pkx.ir;
import org.pkx.entity.ConstantEntry;
import org.pkx.asm.Type;
import org.pkx.asm.Operand;
import org.pkx.asm.ImmediateValue;
import org.pkx.asm.MemoryReference;
import org.pkx.asm.Symbol;

public class Str extends Expr {
    protected ConstantEntry entry;

    public Str(Type type, ConstantEntry entry) {
        super(type);
        this.entry = entry;
    }

    public ConstantEntry entry() { return entry; }

    public Symbol symbol() {
        return entry.symbol();
    }

    public boolean isConstant() { return true; }

    public MemoryReference memref() {
        return entry.memref();
    }

    public Operand address() {
        return entry.address();
    }

    public ImmediateValue asmValue() {
        return entry.address();
    }

    public <S,E> E accept(IRVisitor<S,E> visitor) {
        return visitor.visit(this);
    }

    protected void _dump(Dumper d) {
        d.printMember("entry", entry.toString());
    }
}
