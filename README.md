# The Code (Java) And Reading Note In Algorithms 4th

![madewith](https://img.shields.io/badge/Made%20With-Java-yellow.svg) ![book](https://img.shields.io/badge/BOOK-Algorithms%204th-red.svg)

Algorithms Fourth Edition Code AND reding note

update time: **2018-10-6 12:04:54**

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


如图所示

![delete](https://algs4.cs.princeton.edu/32bst/images/bst-delete.png)

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

## 平衡查找树

### 2-3查找树

>定义
>一棵2-3查找树或为一棵空树，或由以下结点组成 
> * 2-结点：含有一个键（及其对应的值）和两个链接，左链接指向的2-3树中的键都小于该结点，右链接指向的2-3树中的键都大于该结点
>* 3-结点：含有两个键（及其对应的值）和三条链接，左链接指向的2-3树中的键都小于该结点，中链接指向的2-3树中的键都位于该结点的两个键之间，右链接指向的2-3树中的键都大于该结点

![2-3](https://algs4.cs.princeton.edu/33balanced/images/23tree-anatomy.png)

一棵完美平衡的2-3查找树中的所有空链接到根结点的距离都应该是相同的。下面我们来看看2-3查找树的基本操作

#### 查找

关于2-3树的查找算法我们可以根据上一节的二叉查找树的查找算法进行一般化，
关于命中和未命中的过程如图下所示。

![get](https://algs4.cs.princeton.edu/33balanced/images/23tree-search.png)


#### 向2-结点插入新键
这种插入情况是最简单的，方法和二叉查找树一样，可以先进行一次未命中的查找，然后把新结点挂在底部即可，但是为了保证2-3树的平衡性，而规定在2-结点插入，我们可以将它转化为3-结点。

![2-](https://algs4.cs.princeton.edu/33balanced/images/23tree-insert2.png)

#### 向一棵只含一个3-结点的树中插入新键

为了讲新键插入，我们先临时讲新键存入该结点中，使之成为一个4-结点。它很自然地拓展了以前的结点并含有3个键4条链接。创建一个4-结点很方便，因为很容易将它转换为一棵由3个2-结点组成的2-3树，其中一个结点（根）含有中键，一个含有3个键中的最小者，一个结点含有3个键中的最大者。

![3-](https://algs4.cs.princeton.edu/33balanced/images/23tree-insert3a.png)

#### 向一个父结点为2-结点的3-结点中插入新键

在这种情况下，我们需要在**维持树的完美平衡的前提下为新键腾出空间**。可以像上一个情况一样创造一个临时的4-结点并分解，但此时我们不会为中键创造一个新结点，而是将其移动至原来的父结点中。

![3-](https://algs4.cs.princeton.edu/33balanced/images/23tree-insert3b.png)

#### 向一个父结点为3-结点的3-结点中插入新键

和上一种情况一样，可以创造一个4-结点并且分解，而父结点是一个3-结点，于是再次创造一个4-结点，然后和上一步做一样的变换，于是就能够推广到一般情况：可以不断创造4-结点分解并将中键插入到父结点去，知道遇到一个2-结点并将它替换为一个不需要继续分解的3-结点，或者是到达3-结点的根。

![3-](https://algs4.cs.princeton.edu/33balanced/images/23tree-insert3c.png)

#### 分解根结点

如果从插入结点到根节点的路径全都是3-结点，那到最后根节点将会是一个4-结点。此时可以讲根节点的4-结点进行分解，使得树高+1.

![3-](https://algs4.cs.princeton.edu/33balanced/images/23tree-split.png)

### 红黑二叉查找树

红黑二叉查找树(后用‘红黑树’)基本思想是标准的二叉查找树（完全由2-结点构成）和一些额外的信息来表示2-两个2-结点连接起来构成一个3-结点，黑链接则是2-3树中的普通链接，确切地说，我们将3-结点表示为由一条**左斜**的红色链接相连的两个2-结点。

![红黑树](https://algs4.cs.princeton.edu/33balanced/images/redblack-encoding.png)

运用红黑树的表示法的优点是，我们无需修改就可以直接使用标准的二叉查找树的get()方法

#### 定义

对于任意的2-3树，只要对结点进行转换，我们都可以立即派生出一棵对应的二叉查找树。我们将这种方式表示2-3树的二叉查找树成为红黑树

#### 等价定义

红黑树的另一种定义是含有红黑链接并满足下列条件的二叉查找树：
* 红链接均为左链接；
* 没有任何一个结点同时和两条红链接相连；
* 该树是完美黑色平衡的，即任意空链接到根结点的路径上的黑链接数量相同。

满足这样定义的红黑树和相应的2-3树是一一对应的。

#### 《算法导论》中的定义
>一棵红黑树是满足下面**红黑性质**的二叉搜索（查找）树：
>
>* 每个结点或是红色的，或是黑色的 
>
>* 根结点是黑色的
>
>* 每个叶结点(NIL)是黑色的
>
>* 如果一个结点是红色的，则它的两个子结点都是黑色的
>
>* 对每个结点，从该结点到其所有后代叶结点的简单路径上，均包含相同树木的黑色结点


#### 关于一一对应

如果将红黑树的红链接画平，然后将红链接相连的结点合并，得到的就是一棵2-3树。相反，如果将一棵2-3树中的3-结点画作由红色左链接相连的两个2-结点，那么不会存在能够和两条红链接相连的结点，并且树是完美平衡的。

![RST](https://algs4.cs.princeton.edu/33balanced/images/redblack-1-1.png)

由此可以知道红黑树既是二叉查找树，又是2-3树，所以可以试着将两种结构的算法的优点结合起来


#### 代码表示

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter3/RBT.java)


#### 相关操作

##### 旋转

为了满足红黑树定义，当右链接出现了红链接或是两条连续的红链接时需要进行修复。

旋转操作能够改变红链接的指向

在旋转过后，父子结点的颜色以及属性都发生改变，此时应该进行更新。

旋转过程以及代码如图所示

![rotateLeft](https://algs4.cs.princeton.edu/33balanced/images/redblack-left-rotate.png)
![rotateRight](https://algs4.cs.princeton.edu/33balanced/images/redblack-right-rotate.png)


##### 向单个2-结点中插入新键

当树只有一个2-结点时，有两种情况：

* 新键 < 老键  则直接插入红色结点即可

* 新键 > 老键	则在插入后需要使用root = rotateLeft(root) 将其旋转为红色左链接。

##### 向树底部的2-结点插入新键

插入底部的2-结点也有两种情况：

* 当插入父结点的左链接时，则使用上一个点的两种情况分析即可。

* 当插入父结点的右链接时，则插入后是一个错误的3-结点，需要进行一次左旋转修复。

##### 向一棵双键树（即一个3-结点）中插入新键

这种情况可以分为三种子情况：

* 新键最大：三者中最简单的就是新键最大的情况，因此它被连接到3-结点的右链接。此时树是平衡的，根节点为中间大小的键，它由两条红链接分别和较小和较大的结点相连。如果将两条红链接都变黑，就得到了一棵由3个结点组成、高为2的平衡树。其他两种情况最终也会转化为这种情况。

* 新键最小：这种情况新键会插入到最左边的空链接，这样就产生了两条连续的红链接，此时只需要将上层的红链接右旋转即可得到第一种情况。

* 新键介于两者之间：这种情况会产生两条红链接，一条红色左链接接一条红链接，此时只需要将下层的红链接左旋转即可得到第二种情况。

![](https://i.loli.net/2018/09/06/5b9125acac062.jpg)

##### 颜色转换

![颜色转换](https://algs4.cs.princeton.edu/33balanced/images/color-flip.png)

##### 根节点总是黑色

在[向一棵双键树（即一个3-结点）中插入新键](#向一棵双键树（即一个3-结点）中插入新键)中，颜色转换会使结点变为红色。这也可能出现在很大的红黑树中。红色的根节点说明根节点是一个3-结点的一部分，但实际情况并不是这样，因此在每次插入时都会将根节点设为黑色。

##### 向树底部的3-结点插入新键
![](https://i.loli.net/2018/09/28/5bade12bbcfc5.jpg)

##### 将红链接在树中向上传递

在红黑树中实现2-3树的插入算法的关键操作所需的步骤：
* 创建一个临时的4-结点
* 将其分解并将红链接由中间键传递给他的传递给它的父结点
* 重复这个过程，直至遇到一个2-结点或者根结点

总之，在沿着插入点到根结点的路径向上移动的时候在所经过的每个结点中顺序完成以下操作，便可以完成插入操作：
* 如果右子结点是红色的而左子结点是黑色的，进行左旋转
* 如果左子结点是红色的且它的左子结点也是红色的，进行右旋转
* 如果左右子结点均为红色，进行颜色转换

#### 实现

```java
 public void put(Key key, Value val) {
        root = insert(root, key, val);
        root.color = BLACK;
        assert check();
    }

    private Node insert(Node h, Key key, Value val) { 
        if (h == null) {
            n++;
            return new Node(key, val, RED);
        }

        int cmp = key.compareTo(h.key);
        if      (cmp < 0) h.left  = insert(h.left,  key, val); 
        else if (cmp > 0) h.right = insert(h.right, key, val); 
        else              h.val   = val;

        // fix-up any right-leaning links
        if (isRed(h.right) && !isRed(h.left))      h = rotateLeft(h);
        if (isRed(h.left)  &&  isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left)  &&  isRed(h.right))     flipColors(h);

        return h;
    }
}
```

![](https://algs4.cs.princeton.edu/33balanced/images/redblack-construction.png)

## 散列表

使用散列的查找算法分为两步

* 用散列函数将被查找的键转化为数组的一个索引
* 处理碰撞冲突

下图为哈希冲突


![冲突](https://algs4.cs.princeton.edu/34hash/images/hashing-crux.png)

### 散列函数

#### 正整数

将整数散列最常用的方法是除留余数法。

对于任意正整数k，计算k除以M的余数(k % M)。其中，如果M不是素数，我们可能无法利用键中包含的所有信息，如下图所示

![](https://algs4.cs.princeton.edu/34hash/images/modular-hashing.png)

如果M使用100，则会将大量的键散列为小于20的索引，但如果使用素数97，散列的分布显然更好。

#### 浮点数

如果键是0到1之间的实数，我们可以将它乘以M并四舍五入得到一个0至M-1之间的索引值。但是这个方法的缺点是这种情况下键的高位起的作用更大，最低位对散列的结果没有影响。修正方法是将键表示为二进制后再使用除留取余法。

#### 字符串

```java
int hash = 0;
for (int i = 0; i < s.length(); i++)
    hash = (R * hash + s.charAt(i)) % M;
```

字符串依然能够使用除留取余法：Java的charAt()函数能够返回一个char值，即一个非负16位整数。如果R比任何字符的值都大，这种计算相当于将字符串当做一个N位的R进制值，将它除以M取余。

#### 组合键
如果键的类型含有多个整型变量，我们可以和String类型一样将它们混合起来，例如类型为Date，其中含有几个整形的域：day，month，year。可以这样计算散列值
```java
int hash = (((day * R + month) % M) * R + year) % M 
```
使用除留取余法：Java的charAt()函数能够返回一个char值，即一个非负16位整数。如果R比任何字符的值都大，这种计算相当于将字符串当做一个N位的R进制值，将它除以M取余。

### 基于拉链法的散列表

处理散列冲突，一种方法是将代销为M的数组中每个元素指向一条链表，链表中的每个结点都存储了散列值为钙元素的索引的键值对。这种方法为拉链法。

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter3/SeparateChainingHashST.java)

### 基于线性探测的散列表

实现散列表的另一种方式就是用大小为M的数组保存N个键值对，其中N>M，所以需要依靠数组中的空位解决碰撞冲突。基于这种策略的所有方法被统称为开放地址散列表。

开放地址散列表中最简单的方法叫做现行探测发：当碰撞发生时，我们直接检查散列表中的下一个位置(将索引值加一)。这样的线性探测可能产生三种结果：
* 命中，该位置的键和被查找的键相同；
* 未命中，键为空（该位置没有键） 
* 继续查找，该位置的键和被查找的键不同。

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter3/LinearProbingHashST.java)
