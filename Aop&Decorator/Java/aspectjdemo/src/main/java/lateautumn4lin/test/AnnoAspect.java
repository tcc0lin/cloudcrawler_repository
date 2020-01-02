package lateautumn4lin.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnoAspect {

    @Pointcut("execution(* lateautumn4lin.test.App.say(..))")
    public void jointPoint() {
    }

    @Before("jointPoint()")
    public void before() {
        System.out.println("AnnoAspect before say");
    }


    @After("jointPoint()")
    public void after() {
        System.out.println("AnnoAspect after say");
    }

}