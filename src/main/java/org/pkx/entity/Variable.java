package org.pkx.entity;
import org.pkx.ast.TypeNode;
import org.pkx.type.*;

abstract public class Variable extends Entity {
    public Variable(boolean priv, TypeNode type, String name) {
        super(priv, type, name);
    }
}
