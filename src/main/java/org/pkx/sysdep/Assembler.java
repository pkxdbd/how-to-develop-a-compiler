package org.pkx.sysdep;
import org.pkx.exception.IPCException;

public interface Assembler {
    void assemble(String srcPath, String destPath,
            AssemblerOptions opts) throws IPCException;
}
