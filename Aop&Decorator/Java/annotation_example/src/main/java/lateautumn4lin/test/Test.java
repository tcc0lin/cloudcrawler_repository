package lateautumn4lin.test;

public class Test {
    @Detect
    public void output(){
        System.out.println("1234567890");
    }
    @Detect
    public void addition(){
        System.out.println("1+1="+(1+1));
    }
    @Detect
    public void subtraction(){
        System.out.println("1-1="+(1-1));
    }
    @Detect
    public void multiplication(){
        System.out.println("3 x 5="+ 3*5);
    }
    @Detect
    public void division(){
        System.out.println("6 / 0="+ 6 / 0);
    }
}
