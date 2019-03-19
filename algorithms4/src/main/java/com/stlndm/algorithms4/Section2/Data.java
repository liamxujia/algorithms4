package com.stlndm.algorithms4.Section2;

/**
 * Data
 */
public class Data implements Comparable<Data>{

    private final int day;
    private final int month;
    private final int year;
    public Data(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    public int compareTo(Data that) {
        if (year > that.year) return +1;
        if (year < that.year) return -1;
        if (month > that.month) return +1;
        if (month < that.month) return -1;
        if (day > that.day) return +1;
        if (day < that.day) return -1;
        return 0;
    }
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}