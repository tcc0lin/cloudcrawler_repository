package lateautumn4lin.test;


import java.lang.annotation.Annotation;

//@InheritedAnnotation1
public class InheritedTestChild extends InheritedTest {
    public static void main(String[] args) {
        Annotation[] allAnnos = InheritedTestChild.class.getAnnotations();
        Annotation[] deAnnos = InheritedTestChild.class.getDeclaredAnnotations();
        for (Annotation annotation : allAnnos) {
            System.out.println(String.format("InheritedTestChild All Annotation: %s",annotation));
        }
        /*
        子类没有声明注释的时候，自动继承父类的注释，结果如下:
            InheritedTestChild All Annotation: @lateautumn4lin.test.InheritedAnnotation()
         */
        for (Annotation annotation : deAnnos) {
            System.out.println(String.format("InheritedTestChild Declare Annotation: %s",annotation));
        }
        /*
        当子类自省定义注释的时候，也就是打开@TestAnnotation1的时候，结果如下:
            InheritedTestChild All Annotation: @lateautumn4lin.test.InheritedAnnotation()
            InheritedTestChild All Annotation: @lateautumn4lin.test.InheritedAnnotation1()
            InheritedTestChild Declare Annotation: @lateautumn4lin.test.InheritedAnnotation1()
         */
    }

}
