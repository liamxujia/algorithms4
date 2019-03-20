package com.stlndm.algorithms4.Section2;

/**
 * MergeBU
 */
public class MergeBU {

    private static Comparable[] aux;
    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo = sz + sz) {
                Merge.merge(a, lo, lo + sz - 1, Math.min(lo + sz - 1, N - 1));
            }
        }
    }
}