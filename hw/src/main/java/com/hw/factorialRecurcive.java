package com.hw;

public class factorialRecurcive {
    static int factorialecurcive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialecurcive(value - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4, result;
        result = factorialecurcive(number);
        System.out.println(number + " factorial = " + result);

        int datainput = 5, hasildata;
        hasildata = factorialecurcive(datainput);
        System.out.println(datainput + " factorialRec. nya = " + hasildata);
    }
}
