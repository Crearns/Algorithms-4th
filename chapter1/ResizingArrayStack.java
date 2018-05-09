package chapter1;

import java.util.Iterator;

/*=================================================================
 * name:ResizingArrayStack (下压栈)
 * 
 * 动态调整数组大小的实现
 * 
 * 这份泛型的可迭代的Stack API实现是所有集合类抽象数据类型实现的模板
 * 它将所有保存在数组中，并动态调整数组的大小以保持数组大小和栈大小之比小于一个常数
 * 
 * 它几乎达到了任意集合类数据类型的实现的最佳性能：
 * 1.每项操作的用时都与集合大小无关
 * 2.空间需求总是不超过集合大小乘以一个常数
 * =================================================================
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item [] a = (Item[])new Object();
	private int N = 0;
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < N; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
	public void push(Item item) {
		if (N == a.length)
			resize(2 * a.length);
		a[N++] = item;
	}
	
	public Item pop() {
		Item item = a[--N];
		a[N] = null; //避免对象游离
		if (N > 0 && N == a.length / 4)
			resize(a.length / 2);
		return item;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i = N;

		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return a[--i];
		}
		
		public void remove() {
			
		}
		
	}
}
