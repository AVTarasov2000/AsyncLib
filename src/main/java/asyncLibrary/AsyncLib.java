package asyncLibrary;


import asyncLibrary.operations.*;
import asyncLibrary.operations.Operation;

import java.util.HashMap;
import java.util.Map;

public class AsyncLib {

    public static Map <String, Operation> operations = new HashMap <>();
    static {
        operations.put("+", new Sum());
        operations.put("-", new Difference());
        operations.put("*", new Composition());
        operations.put("/", new Division());
    }

    public static Promise async(Asyncable asyncable){
        return new Promise (asyncable);
    }



}
