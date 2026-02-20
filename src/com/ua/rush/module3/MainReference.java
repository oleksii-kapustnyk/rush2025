package com.ua.rush.module3;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class MainReference {

    public static void main(String[] args) {
        SoftReference<Object> softReference = new SoftReference<>(new Object());
       // obj = null;
        System.out.println(softReference.get());
        System.gc();
        System.out.println(softReference.get());

        System.out.println("---------------------");
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());

        System.out.println("---------------------");
        PhantomReference<Object> phantomReference = new PhantomReference<>(new Object(), new ReferenceQueue<>());
        System.out.println(phantomReference.get());
        System.gc();
        System.out.println(phantomReference.get());

    }


}
