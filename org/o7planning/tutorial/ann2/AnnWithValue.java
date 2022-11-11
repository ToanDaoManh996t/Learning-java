package org.o7planning.tutorial.ann2;

public @interface AnnWithValue {
     int value();
     String name() default "";
}
