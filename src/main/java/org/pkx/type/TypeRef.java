package org.pkx.type;
import org.pkx.ast.Location;

public abstract class TypeRef {
    protected Location location;

    public TypeRef(Location loc) {
        this.location = loc;
    }

    public Location location() {
        return location;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
