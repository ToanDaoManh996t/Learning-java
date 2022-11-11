package org.o7planning.tutorial.ann2;

public class UsingAnnWithValue {
    @AnnWithValue(name = "name1", value = 100)
    public void someMethod1() {}

    @AnnWithValue(value = 100)
    public void someMethod2() {}

    @AnnWithValue(100)
    public void someMethod3() {}
}
