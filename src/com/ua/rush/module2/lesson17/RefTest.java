package com.ua.rush.module2.lesson17;

public class RefTest {

    private int x;
    protected int y;
    public int z;
    int a;

    public RefTest() {

    }

    public RefTest(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print(String str) {
        System.out.println(str + " public x = " + x + ", y = " + y + ", z = " + z);
    }

    private void print2(String str) {
        System.out.println(str + " private x = " + x + ", y = " + y + ", z = " + z);
    }

    protected void print3(String str) {
        System.out.println(str + " protected x = " + x + ", y = " + y + ", z = " + z);
    }

}
