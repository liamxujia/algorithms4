package com.stlndm.algorithms4.Section1;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

/**
 * DoublingTest
 */
public class DoublingTest {

    public static double timeTrial(int N) {
        // 为处理N个随机的六位整数的ThreeSum.count()计时
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cut = ThreeSum.count(a);
        return timer.elapsedTime();
    }
    public static void main(String[] args) {
        // 打印运行时间的表格
        for (int N = 250; true; N += N) {
            // 打印问题规模为N时程序的用时
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1fs\n", N, time);
        }
    }
}