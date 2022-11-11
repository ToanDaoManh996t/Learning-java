package org.o7planning.tutorial.ann1;

@MyFirstAnnotation(name = "Some name", description = "Some description")
public class UsingMyFirstAnnotation {
    @MyFirstAnnotation(name = "John", description = "Written by John")
    public UsingMyFirstAnnotation() {}

    @MyFirstAnnotation(name = "Tom")
    public void someMethod() {}

    public void todo(@MyFirstAnnotation(name = "none") String job) {
        @MyFirstAnnotation(name = "Some name")
        int localVariable = 0;
    }
}
