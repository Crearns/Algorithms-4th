# The Code (Java) And Reading Note In Algorithms 4th

![madewith](https://img.shields.io/badge/Made%20With-Java-yellow.svg) ![book](https://img.shields.io/badge/BOOK-Algorithms%204th-red.svg)

Algorithms Fourth Edition Code AND reding note

update time: **2018-8-31 22:06:27**

pictures are FROM **Wikipedia** AND [Teaching Website](https://algs4.cs.princeton.edu/home/)

## Step to developing a usable algorithms

* Model the problem.
* Find an algorithms to solve it.
* Fast enough ? Fits in memory?
* If not, figure out why.
* Find a way to address the problem.
* Iterate until satisfied.


# Chapter2
##  Selection

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Selection.java)

>首先找到数组中最小的那个元素，其次，将它和数组第一个元素交换位置(如果第一个元素就是最小元素那么他就自己和自己交换)。再次，再生喜爱的元素中找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。

对于长度为N的数组，选择排序需要大约N²/2次比较和N次交换

### 特点

* 运行时间和输入无关。为了找出最小的元素而扫描一遍数组并不能为下一遍扫描提供信息。
* 数据移动是最小的。每次交换都会改变两个数组的元素的值，因此选择排序用了N次交换。
* 最坏情况时间复杂度 O(n^2)
* 最好情况时间复杂度 O(n^2)
* 平均情况时间复杂度 O(n^2)

### 过程图

![选择排序](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

### 分步图
![选择排序](https://algs4.cs.princeton.edu/21elementary/images/selection.png)



## Insertion

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Insertion.java)


>通常人们郑礼桥拍的方法是一张一张的来，将每一张牌插入到其他已经有序的牌中的适当位置。计算机的实现中，为了给要插入的元素腾出位置，需要将其余所有元素在插入之前都向右移动一位。

对于随机排列的长度为N且主键不重复的数组，平均情况下插入排序需要~ N²/4次比较以及~ N²/4次交换。最坏情况下需要~ N²/2次比较和~ N²/2次交换，最好情况需要N-1次比较和0次交换

### 特点
* 最坏情况时间复杂度 O(n^2)
* 最好情况时间复杂度 O(n)
* 平均情况时间复杂度 O(n^2)

### 过程图

![选择排序](https://upload.wikimedia.org/wikipedia/commons/4/42/Insertion_sort.gif)

### 分步图
![选择排序](https://algs4.cs.princeton.edu/21elementary/images/insertion.png)


## Shell

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Shell.java)

>希尔排序的思想是使数组中任意间隔为h的元素都是有序的。这样的数组被称为h有序数组。换句话说，一个h有序数组就是h个互相独立的游戏数组编织在一起组成的一个数组。在进行排序是，如果h很大，我们能将元素移动到很远的地方，为实现更小的h有序创造方便。用这种方式，对于任意为1结尾的h序列，我们能够将数组排序，这就是希尔排序。

### 特点
* 最坏情况时间复杂度 O(nlog2 2n)
* 最好情况时间复杂度 O(n log n)
* 平均情况时间复杂度 取决于h的值

### 过程图

![希尔排序](https://upload.wikimedia.org/wikipedia/commons/d/d8/Sorting_shellsort_anim.gif)

### 分步图
![选择排序](https://algs4.cs.princeton.edu/21elementary/images/shell.png)

---
和选择排序以及插入排序形成对比的是，希尔排序也可以用于大型数组，它对任意排序（不一定是随机的）的数组表现也很好。实际上，对于一个特定的递增序列，构造一个希尔排序运行缓慢的数组并不容易。


## Merge Top-Down

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Merge.java)

>归并排序（MERGE-SORT）是建立在归并操作上的一种有效的排序算法,该算法是采用分治法（Divide AND Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为二路归并。


要理解归并排序就要仔细研究该方法的调用的动态情况，例如要将a[0..15]排序，sort()方法会调用自己将a[0...7]排序，再在其中调用自己将a[0...3]和a[0...1]排序。在将a[0]、a[1]排序之后，终于才会开始将a[0]、a[1]归并，第二次归并是a[2]、a[3]，最后是a[0...1] a[2...3] 以此类推。学过数据结构的递归时我们肯定看过汉诺塔算法的递归过程，这两个地方很相似。
这段代码也是我们分析归并排序的运行时间的基础。因为归并排序式算法设计中分治思想的典型应用。

### 特点
* 最坏情况时间复杂度 O(n log n) (typical)
* 最好情况时间复杂度 O(n log n)
* 平均情况时间复杂度 O(n log n)

### 过程图
![归并排序](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)


### 分布图

![归并排序](https://algs4.cs.princeton.edu/22mergesort/images/mergesortTD.png)



##  Merge Down-Top

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/MergeBU.java)

> 实现归并排序的另一种方法是先归并那些微型数组，然后再成对归并得到的子数组，如此这般，知道我们将整个数组归并在一起。这种方法比标准的递归方法所需要的代码量更少。

首先我们两两归并（把每个元素想象成一个大小为1的数组），然后四四归并（将两个大小为2的数组归并成一个有4个元素的数组），然后八八归并，一直下去。在每一轮归并中，最后一次归并的第二个子数组可能比第一个子数组要小（但这对merge()方法不是问题），如果不是的话所有的归并中两个数组大小都应该一样，而在下一轮中子数组的大小会翻倍。


### 过程图

![归并排序](https://upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Merge_sort_animation2.gif/220px-Merge_sort_animation2.gif)


### 分布图

![归并排序](https://algs4.cs.princeton.edu/22mergesort/images/mergesortBU.png)


### 注意点

* 归并排序的空间复杂度不是最优的
* 在实践中不一定会遇到最坏情况
* 出了比较，算法的其他操作（例如访问数组）也可能很重要
* 不进行比较也可能将某些数据排序

以后还将继续学习其他一些排序算法

---

## Quick

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Quick.java)

> 快速排序是一种分治的排序算法。它将一个数组分成两个子数组，将两部分独立地排序。
> 通过"切分"将数组分成两半
> 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。

### 切分

```java
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
```

切分能将切分元素放到一个合适的位置，然后再用递归调用将其他位置的元素排序(一般策略是先随意抽取a[lo]当切分元素)
该方法使得数组满足下面三个条件
* 对于某个j，a[j]已经排定；
* a[lo]到a[j-1]中的所有元素都不大于a[j]。
* a[j+1]到a[hi]中的所有元素都不小于a[j]。

切分示意图如图所示

![切分](https://algs4.cs.princeton.edu/23quicksort/images/partitioning-overview.png)

![切分](https://algs4.cs.princeton.edu/23quicksort/images/partitioning.png)


### 算法过程图

![快排](https://algs4.cs.princeton.edu/23quicksort/images/quicksort.png)


### 注意事项

快速排序需要注意的问题如下：

* 原地切分
* 别越界
* 保持随机性
* 终止循环
* 处理切分元素值有重复的情况(具体看下一个三向切分快速排序)
* 终止递归

### 性能特点

* 最坏情况时间复杂度 O(n^2)
* 最好情况时间复杂度 O(n log n) or O(n) (三向切分快速排序)
* 平均情况时间复杂度 O(n^2)

快速排序的切分方法内循环会用一个递增的索引将数组元素和一个定值比较。这种间接性也是快速排序一个优点，很难想象排序算法有比这更短小的内循环了。例如，归并排序和希尔排序一般都比快速排序慢，__其原因就是它们还在内循环中移动数据。__ 快速排序的另一个速度优势在于它的比较次数很少。排序效率最终还是依赖切分数组的效果，而这依赖于切分元素的值。切分将一个较大的随机数组分成两个随机子数组，而实际上这种分割可能发生在数组的任意位置（对于元素不重复的数组而言）。

尽管快速排序有很多优点，它的基本实现仍有潜在的缺点：在切分不平衡的时候这个程序可能会极为低效。例如，如果第一次从最小的元素切分，第二次从第二小的元素切分，这般如此，每次调用只会溢出一个元素。这会导致一个大子数组需要切分很多次。我们要在快速排序前将数组随机排序的主要原因就是要避免这种情况。它能够将产生糟糕的切分的可能型降到最低，我们就无需为此担心了。
 

 ### 改进算法

 [Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Quick2.java)

 ```java
public static void sort(Comparable[] a, int lo, int hi) {
		if(hi <= lo) return;
		int lt = lo, i = lo + 1, gt = hi;
		Comparable v = a[lo];
		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if(cmp < 0) exch(a, lt++, i++);
			else if (cmp > 0) exch(a, i, gt--);
			else i++;
		}
		sort(a, lo, lt-1);
		sort(a, gt+1, hi);
}
 ```

> Dijkstra的算法如 ”三向切分的快速排序算法“ 中极为简洁的切分代码所示。它从左到右遍历数组一次，维护一个指针lt使得a[lo.. lt-1]中的元素都小于v，一个指针gt使得a[gt+1..hi]中的元素都大于v，一个指针i使得a[lt..i-1]中的元素都等于v，a[i..gt]的元素还未确定。

直接处理一下情况
* a[i]大于v，将a[lt]和a[i]交换，将lt和i加一
* a[i]小于v，将a[gt]和a[i]交换，将lt减一
* a[i]等于v，将i加一


如图所示

![三向切分](https://algs4.cs.princeton.edu/23quicksort/images/partitioning4-overview.png)


对于标准的快速排序，随着数组规模的增大其运行时间会趋于平均运行时间，大幅偏离的情况非常罕见，因此可以肯定三向切分快速排序的的运行时间和输入的信息量的N倍是成正比的。
这些并不是快速排序发展的终点，因为有人研究出了完全不需要比较的排序算法。


## 优先队列

当需要处理有序的元素，但不一定要求全部有序，或是不一定要一次就将它们排序，可以用到优先队列。
优先队列是支持**删除最大元素**和**插入元素**操作的数据结构，这两个操作也是优先队列总重要的操作，优先队列的使用和队列（删除最老的元素）以及栈（删除最新的元素）类似，但高效地实现它则更具有挑战性。

通过插入一列元素然后一个个的删掉其中最小的元素，我们可以用优先队列实现排序算法。一种名为堆排序的重要排序算法也来自于基于堆的优先队列的实现。


### 二叉堆实现优先队列的基本操作

#### 关于二叉堆
>二叉堆是一组能够用堆有序的完全二叉树排序的元素，并在数组中按照层级储存（不是用数组的第一个位置）

#### 二叉堆对优先队列的实现
[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/MaxPQ.java)

#### 堆的有序化的两种方法

##### 由下至上的堆有序化（上浮）

```java
	private void swim(int k) {
		while (k > 1 && less(k/2, k)) {
			exch(k/2, k);
			k = k/2;
		}
	}
```
如果堆的有序状态因为某个结点变得比它父节点更大而被打破，那么我们就需要通过二叉树中父结点和子结点的下标关系来交换他和他的父结点来修复堆。
通过循环，一遍遍的修复，直至堆顶，此时可修复打破的堆。

![上浮](https://algs4.cs.princeton.edu/24pq/images/swim.png)
##### 由上至下的堆有序化（下沉）

```java
	private void sink(int k) {
		while (2*k <= N) {
			int j = 2*k;
			if(j < N && less(j, j+1)) j++;
			if (!less(k, j)) break;
			exch(k, j);
			k = j;
		}
	}
```
如果堆的有序状态因为某个结点变得比它的两个子结点或是其中之一更小而被打破了，那么我们可以通过将它和它的两个子节点只能改的较大者交换来修复堆。交换可能会在子结点继续打破有序状态，所以需要不断用相同的方式将其修复，交换原理与上浮相同，都是根据父子的下标关系。

![下沉](https://algs4.cs.princeton.edu/24pq/images/sink.png)

### 堆排序
根据优先队列的删除最大（小）元素的操作，我们可以重复调用这个操作，于是便有了一种新的排序————堆排序

堆排序可以分为来年各个阶段,**堆的构造阶段**以及**下沉排序阶段**

构造阶段是将元是数组重新组织安排进一个堆中

下沉阶段是将堆中最大元素删除，然后放入堆缩小后的数组中空出的位置。


![堆排序](https://algs4.cs.princeton.edu/24pq/images/heapsort-trace.png)

#### 排序代码

```java
public static void sort(Comparable[] a){
	int N = a.length;
	for (int k = N/2; k >= 1; k--){
		sink(a, K, N);
		while (N > 1){
			exch(a, 1, N--);
			sink(a, 1, N);
		}
	}
}

```


# Chapter3 Search

## 符号表

符号表最主要的目的就是将一个键和一个值联系起来。
它们不光能够高效地插入和查找，还可以进行其他几种方便的操作.

## 二叉查找树

二叉排序树或者是一棵空树，或者是具有下列性质的二叉树：

* 若左子树不空，则左子树上所有结点的值均小于或等于它的根结点的值；

* 若右子树不空，则右子树上所有结点的值均大于或等于它的根结点的值；
  
* 左、右子树也分别为二叉排序树；

![二叉查找树](https://algs4.cs.princeton.edu/32bst/images/bst-anatomy.png)

### 二叉查找树的数据表示

和链表一样，我们嵌套定义一个私有类来表示二叉查找树上的一个节点**Node**。每个结点都含有一个键、一个值、一个左链接、一个右链接和一个节点计数器。左链接指向一棵小于该结点的所有键组成的二叉查找树，右链接指向一棵有由大于该结点的所有键组成的二叉查找树。变量N给出了以该结点为根的子树的结点总数。

一棵二叉查找树代表了一组键(及其对应的值)的集合，而同一个集合可以用多棵不同的二叉查找树表示。如果我们将一棵二叉查找树的所有键投影到一条直线上，保证一个结点的左子树的键出现在他的左边，右子树的键出现在他的右边，那么我们一定可以得到一条有序的键列。我们会利用二超查找树的这种天生的灵活性，用多棵二叉查找树表示同一组的键来实现构建和使用二叉查找树的高效算法。

### 查找过程

一般来说，在符号表中查找一个键可能得到两种结果。如果含有该键的及诶单存在于表中，我们的查找就**命中**了，然后返回相应的值。否则查找**未命中**。根据数据表示的递归结构我们马上就能得到，在二叉树中查找一个键的递归算法：如果树是空的，则查找未命中；如果被查找的键和跟节点的键相等，查找命中，否则我们就（递归地）在适当的子树中继续查找。如果被查找的键较小就选择左子树，较大则选择右子树。


![查找过程](https://algs4.cs.princeton.edu/32bst/images/bst-search.png)


### 代码表示

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter3/BST.java)


### 有序性相关的方法

#### 最大键和最小键 向上取整和向下取整
```java
public Key min(){
	return min(root).key;
}

private Node min(Node x){
	if (x.left == null) return x;
	return min(x.left)
}

//max同理

public Key floor(Key key){
	Node x = floor(root, key);
	if (x == null) return null;
	return x.key;
}

private Node floor(Node x, Key key){
	if (x == null) return null;
	int cmp = key.compareTo(x.key)
	if (cmp == 0) return x;
	if (cmp < 0) return floor(x.left, key);
	Node t = floor(x.right, key);
	if (t != null) 	return t;
	else		return x;
}

//ceiling同理

```

如果给定的键key小于二叉查找树的根节点的键，那么小于等于key的最大键floor(key)UI定在根节点的左子树;如果给定的键key大于二叉树的根节点，那么只有当根节点右子树存在小于等于key的结点时，小于等于key的最大键才会出现在右子树中，否则根节点就是小于等于key的最大键

![floor](https://algs4.cs.princeton.edu/32bst/images/bst-floor.png)


#### 排名
##### select
假设我们想找到排名为k的键(即树中正好有k个小于它的键)。如果左子树中的结点数t大于k，那么我们就继续(递归地)在左子树中查找排名为k的键；如果t等于k，我们就返回根节点的键；如果t小于k，我们就(递归地)在右子树中查找排名为(k-t-1)的键。
##### rank
rank是select的逆方法，它会返回给定键的排名。它的实现和select，可以通过代码理解。

```java
public Key select(int k){
	return select(root, k).key;
}

private Node select(Node x, int k){
	//返回排名为k的结点
	if (x == null) return null;
	int t = size(x.left);
	if (t > k) return select(x.left, k);
	else if (t < k) return select(x.right, k-t-1);
	else return x;
}

public int rank(Key key){
	return rank(key, root);
}

private int rank(Ket key, Node x){
	//返回以x为根的子树中x.key的键的排位
	if (x == null) retrun 0;
	int cmp = key.compareTo(x.key);
	if (cmp > 0) return rank(key, x.left);
	else if (cmp > 0) return 1 + size(x.left) + rank(key, x.rigth);
	else return size(x.left);
}
```

![rank](https://algs4.cs.princeton.edu/32bst/images/bst-select.png)


#### 删除

二叉树中最难实现的方法就是delete()方法，即从符号表中删除一个键值对。为了简单，我们先实现deleteMin()方法，即删除最小键对应的键值对。我们要不断深入根节点的左子树直到遇见一个空连接，然后将指向该结点的链接指向该结点的右子树，如图所示

---
![deleteMin](https://algs4.cs.princeton.edu/32bst/images/bst-deletemin.png)
---
代码如下
```java
public void deleteMin(){
	root = deleteMin(root);
}

private Node deleteMin(Node x){
	if (x.left == null) return  x.right;
	x.left = deleteMin(x.left);
	x.N = size(x.left) + size(x.right) + 1;
	return x;
}
```


我们可以用类似的方式删除任意只有一个子结点(或没有子结点)的节点，至于任意结点，难点在于删除后的“善后”处理，即被删除结点的两个子树需要处理。_**T.Hibbard**_ 在1962年提出了解决这个难题的第一个方法，在删除结点x后用它的后继结点填补它的位置。因为x有一个右子结点，因此它的后继结点就是其右子树中的最小结点。这样替换仍然能够保证树的有序性，因为x.key和它的后继结点的键之间不存在其他的键。用4个简单的步骤完成将x替换为它的后继结点的任务

1. 将指向即将被删除的结点链接保存为t;
2. 将x指向它的后继结点min(t.right);
3. 将x的右链接(原本指向一棵所有结点都大于x.key的二叉查找树)指向deleteMin(t.right)，也就是在删除后所有结点仍然都大于x.key的二叉查找树;
4. 将x的左链接(本为空)设为t.left(其下所有的键都小于被删除的结点和它的后继结点)。

---
如图所示

![delete](https://algs4.cs.princeton.edu/32bst/images/bst-delete.png)
---
代码如下
```java
public void delete(Key key){
	root = delete(root, key);
}

private Node delete(Node x, Key key){
	if (x == null) return null;
	int cmp = key.compareTo(x.key);
	if (cmp < 0) x.left = delete(x.left, key);
	else if (cmp > 0) x.right = delete(x.right, key);
	else{
		if (x.right == null) return x.left;
		if (x.left == null) return x.right;
		Node t = x;
		x = min(t.right);
		x.right = deleteMin(t.right);
		x.left = t.left;
	}
	x.N = size(x.left) + size(x.right) + 1;
	return x;
}
```
#### 范围查找
要实现范围查找，我们需要了解遍历二叉树的基本方法之一——**中序遍历**，中序遍历通过递归方法很容易实现，也很好理解，这里省略。
而二叉排序树的中序遍历就是把键的大小按从小到大的顺序遍历，根据这个原理可以实现范围查找。

---
代码如下

```java
public Iterable<Key> keys(){
	return keys(min(), max());
}

public Iterable(Key) keys(Key lo, Key hi){
	Queue<Key> queue = new Queue<Key>();
	keys(root, queue, lo, hi);
	return queue;
}

private void keys(Node x, Queue<Key> queue, Key lo, Key hi){
	if (x == null) return;
	int cmplo = lo.compareTo(x.key);
	int cmphi = hi.compareTo(x.key);
	if (cmplo < 0) keys(x.left, queue, lo, hi);
	if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
	if (cmphi > 0) keys(x.right, queue, lo, hi);
}
```

### 二叉查找树(BST)总结
* 二叉查找树的定义： 若左子树不空，则左子树上所有结点的值均小于或等于它的根结点的值；若右子树不空，则右子树上所有结点的值均大于或等于它的根结点的值；左、右子树也分别为二叉排序树。
* 二叉查找树的的每个结点Node都含有一个键、一个值、一个左链接、一个右链接和一个节点计数器。
* 二叉查找树的查找过程：在二叉树中查找一个键的递归算法：如果树是空的，则查找未命中；如果被查找的键和跟节点的键相等，查找命中，否则我们就（递归地）在适当的子树中继续查找。如果被查找的键较小就选择左子树，较大则选择右子树。
* 二叉查找树的有序性相关方法，较多的方法的原理都和**二分查找法**差不多，通过递归方法进行。其中删除任意结点较难。