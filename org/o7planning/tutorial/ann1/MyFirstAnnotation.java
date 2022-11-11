package org.o7planning.tutorial.ann1;

public @interface MyFirstAnnotation {
    String name();
    String description() default "";
}
