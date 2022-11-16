package org.o7planning.tutorial.printstream;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class GetStackTraceEx {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
        } catch (Exception e) {
            String s = getStackTrace(e);
            System.err.println(s);
        }
    }

    public static String getStackTrace(Throwable t) {
        OutputStream baos = new ByteArrayOutputStream();
        PrintStream pw = new PrintStream(baos);

        t.printStackTrace(pw);
        pw.close();
        return baos.toString();
    }
}
