import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            TestAnnotation test = new TestAnnotation();
            Method method = TestAnnotation.class.getDeclaredMethod("calculateMethod", int.class, int.class);
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            method.setAccessible(true);
            method.invoke(test, annotation.paramOne(), annotation.paramTwo());
        }catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
