package asyncLibrary.operations;

import asyncLibrary.Valuable;

import java.lang.constant.Constable;

public class Division implements Operation {


    public Constable execute(Valuable a, Valuable b) {
        Object aNum = a.value();
        Object bNum = b.value();
        if(aNum instanceof Integer && bNum instanceof Integer){
            return ((Integer) aNum / (Integer) bNum);
        } else
        if(aNum instanceof Double && bNum instanceof Double){
            return (((Double)aNum).intValue() / ((Double)bNum).intValue());
        } else
        if(aNum instanceof Long && bNum instanceof Long){
            return (((Long)aNum).intValue() / ((Long)bNum).intValue());
        } else
        if(aNum instanceof Short && bNum instanceof Short){
            return (((Short)aNum).intValue() / ((Short)bNum).intValue());
        }
        else {
            throw new NumberFormatException();
        }
    }
}
