package org.pkx.sysdep;
import org.pkx.exception.IPCException;
import java.util.List;

public interface Linker {
    void generateExecutable(List<String> args, String destPath,
            LinkerOptions opts) throws IPCException;
    void generateSharedLibrary(List<String> args, String destPath,
            LinkerOptions opts) throws IPCException;
}
