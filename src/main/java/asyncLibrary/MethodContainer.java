package asyncLibrary;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodContainer {
    Method method;

    public MethodContainer(Method method) {
        this.method = method;
    }

    public Object exec(Object[] args){
        try {
            return method.invoke(null, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
