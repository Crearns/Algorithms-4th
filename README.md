# The Code (Java) And Reading Note In Algorithms 4th

Algorithms Fourth Edition Code and reding note

update time:2018-6-6 17:08:17


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