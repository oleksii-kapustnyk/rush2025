package com.ua.rush.module2.lesson9;

import java.util.Objects;

public class TestCode {

    int a;
    double b;
    char c;
    String d;
    boolean e;
    float f;
    long g;
    short h;
    byte i;

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof TestCode testCode)) return false;

        return a == testCode.a && Double.compare(b, testCode.b) == 0 && c == testCode.c && e == testCode.e && Float.compare(f, testCode.f) == 0 && g == testCode.g && h == testCode.h && i == testCode.i && Objects.equals(d, testCode.d);
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + Double.hashCode(b);
        result = 31 * result + c;
        result = 31 * result + Objects.hashCode(d);
        result = 31 * result + Boolean.hashCode(e);
        result = 31 * result + Float.hashCode(f);
        result = 31 * result + Long.hashCode(g);
        result = 31 * result + h;
        result = 31 * result + i;
        return result;
    }
}
