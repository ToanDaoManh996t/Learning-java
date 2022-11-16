package org.o7planning.tutorial.printstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MyPrintStream extends PrintStream {
    public MyPrintStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public void clearError() {
        super.clearError();
    }
}
