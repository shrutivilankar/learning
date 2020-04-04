package com.shruti.learning;

import java.util.Vector;

public class TestVector {

    public static void main(String[] args){
        Vector v = new Vector();
        v.add("v1");
        v.add("v2");
        v.add("v3");
        System.out.println("size - " + v.size());
        System.out.println("capacity - " + v.capacity());
        v.trimToSize();

        System.out.println("size - " + v.size());
        System.out.println("capacity - " + v.capacity());

    }
}