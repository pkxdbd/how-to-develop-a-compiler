package org.pkx.sysdep;

public interface CodeGenerator {
    AssemblyCode generate(org.pkx.ir.IR ir);
}
