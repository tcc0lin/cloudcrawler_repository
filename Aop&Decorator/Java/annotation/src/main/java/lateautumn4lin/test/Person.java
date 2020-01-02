package lateautumn4lin.test;

import java.lang.annotation.Repeatable;

@Repeatable(Persons.class)
public @interface Person {
    String role() default "";
}