package asyncLibrary;

import java.lang.reflect.Method;
import java.util.Map;

public class Promise <T> implements Valuable {

    private Runner <T> result;
    private Thread thread;

    public Promise(T result) {
        this.thread = null;
        this.result = new Runner <T>(result);
    }

    public Promise(Asyncable<T> asyncable) {
        result = new Runner <T>(asyncable);
        thread = new Thread(result);
        thread.start();
    }

    public T value() {
        if (thread!=null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result.getRes();
    }
}
