package org.o7planning.tutorial.ann3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.SOURCE)

@Target(value = {ElementType.FIELD, ElementType.METHOD})
public @interface AnnFM {
}
