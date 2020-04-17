package com.shruti.learning;

import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.collections4.comparators.NullComparator;

public class TestSortedSet{

    public static void main(String[] args){
        SortedSet<Integer> x = new TreeSet<>(new NullComparator());
        x.add(null);
        x.add(1);
        x.add(null);
        x.add(1);
        x.forEach(e -> System.out.println(e));

    }
}