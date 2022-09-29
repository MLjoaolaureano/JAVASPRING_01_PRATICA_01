package com.example.demo;

import java.util.Comparator;

public enum NumerosRomanosEnum implements Comparator<NumerosRomanosEnum> {
    M(1000, "M"),
    CM(900,"CM"),
    D(500, "D"),
    CD(400,"CD"),
    C(100, "C"),
    XC(90,"XC"),
    L(50, "L"),
    XL(40,"XL"),
    X(10, "X"),
    IX(9,"IX"),
    V(5, "V"),
    IV(4,"IV"),
    I(1, "I");

    public final int value;
    public final String name;

    NumerosRomanosEnum(int value, String name){
        this.value = value;
        this.name = name;
    }


    @Override
    public int compare(NumerosRomanosEnum o1, NumerosRomanosEnum o2) {
        if(o1.value == o2.value) return 0;
        return o1.value > o2.value ? 1:-1;
    }
}