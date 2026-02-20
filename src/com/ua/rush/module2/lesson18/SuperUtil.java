package com.ua.rush.module2.lesson18;

import java.util.Arrays;
import java.util.List;

@Person(name = "Oleksii", age = 30)
public class SuperUtil {

    @Deprecated(since = "1.0", forRemoval = true)
    public void calculate() {

    }

    public void superCalculate() {

    }

    @SafeVarargs
    public final void calculate(List<Integer>... list) {
      //  System.out.println(x);
    }

    public void calculate(int... data) {
        for (int i : data) {
            System.out.println(i);
        }
    }


}
