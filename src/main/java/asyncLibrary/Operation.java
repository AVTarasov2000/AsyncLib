package asyncLibrary;


public class Operation<T> implements Valuable {

    Valuable <T> arg1;
    Valuable <T> arg2;
    String op;


    public Operation(Valuable <T> arg1, Valuable <T> arg2, String op) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.op = op;
    }



    @Override
    public T value() {
        return (T) AsyncLib.operations.get(op).execute(arg1, arg2);
    }
}
