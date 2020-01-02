package lateautumn4lin.test;

import java.lang.annotation.*;

@Person(role="artist")
@Person(role="coder")
@Person(role="PM")
public class RepeatableAnnotation{
    public static void main(String[] args) {
        Annotation[] allAnnos = RepeatableAnnotation.class.getAnnotations();
        for (Annotation annotation : allAnnos) {
            System.out.println(String.format("RepeatableAnnotation All Annotation: %s",annotation));
        }
        boolean hasAnnotation = RepeatableAnnotation.class.isAnnotationPresent(Persons.class);
        System.out.println(hasAnnotation);
        if ( hasAnnotation ) {
            Persons repeatableAnnotation = RepeatableAnnotation.class.getAnnotation(Persons.class);
            for (Person role : repeatableAnnotation.value()){
                System.out.println(String.format("RepeatableAnnotation role: %s",role));
            }
        }
    }
}