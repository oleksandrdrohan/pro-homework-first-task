import java.lang.annotation.*;
import java.lang.reflect.*;

public class TestAnnotation {
    @MyAnnotation(paramOne = 2,paramTwo = 5)
    public void calculateMethod(int a, int b){
        System.out.println(a + b);

    }
}


