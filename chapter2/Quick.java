package chapter2;

import stdio.In;
import stdio.StdOut;
import stdio.StdRandom;

public class Quick {
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);//随机排序数组 原因见 性能特点
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);

	}
	
	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi+1;		//左右扫描指针
		Comparable v = a[lo];		//切分元素
		while (true) {//扫描左右，检查是否结束并交换元素
			while (less(a[++i], v)) if (i == hi) break;
			while (less(v, a[--j])) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
    }
	
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i] + " ");
			StdOut.println();
		}
	}
	
	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if(less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String [] a = {"Q", "U","I","C","K","S","O","R","T","E","X","A","M","P","L","E"};
		sort(a);
		assert isSorted(a);
		show(a);
	}
}
