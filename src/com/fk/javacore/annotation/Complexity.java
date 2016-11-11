package com.fk.javacore.annotation;

public @interface Complexity {
    ComplexityLevel value() default ComplexityLevel.MEDIUM;
}
