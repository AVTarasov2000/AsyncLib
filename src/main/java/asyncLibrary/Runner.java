package asyncLibrary;



public class Runner<T> implements Runnable{

    private T res;
    private Asyncable<T> asyncable;

    public Runner(Asyncable<T> asyncable) {
        this.asyncable = asyncable;
    }

    public Runner(T res) {
        this.res = res;
    }

    @Override
    public void run() {
        res = asyncable.get();
    }

    public T getRes() {
        return res;
    }
}
