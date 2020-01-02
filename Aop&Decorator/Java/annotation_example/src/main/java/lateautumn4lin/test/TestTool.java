package lateautumn4lin.test;
import java.lang.reflect.Method;

public class TestTool {
    public static void main(String[] args) {
        // 获取测试类下面的所有已定义的方法
        Test testobj = new Test();
        Class clazz = testobj.getClass();
        Method[] method = clazz.getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errornum = 0;
        for ( Method m: method ) {
            // 只有被 @Detect 标注过的方法才进行测试
            if ( m.isAnnotationPresent( Detect.class )) {
                log.append(String.format("Detect Func: %s.\n",m.getName()));
                try {
                    m.setAccessible(true);
                    m.invoke(testobj, null);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                    errornum++;
                    log.append(String.format("Detect Func Found Error: %s has errors.",m.getName()));
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }
        log.append(String.format("Detect End: %s has %s errors.",clazz.getSimpleName(),errornum));
        // 生成测试报告
        System.out.println(log.toString());

    }
}
