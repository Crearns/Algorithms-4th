# The Code(Java) In Algorithms 4th

Algorithms Fourth Edition Code

update time:2018-5-30 18:06:13


## Step to developing a usable algorithms

* Model the problem.
* Find an algorithms to solve it.
* Fast enough ? Fits in memory?
* If not, figure out why.
* Find a way to address the problem.
* Iterate until satisfied.

# Chapter2
## Sort
###  Selection

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Selection.java)

>首先找到数组中最小的那个元素，其次，将它和数组第一个元素交换位置(如果第一个元素就是最小元素那么他就自己和自己交换)。再次，再生喜爱的元素中找到最小的元素，将它与数组的第二个元素交换位置。如此往复，直到将整个数组排序。

对于长度为N的数组，选择排序需要大约N²/2次比较和N次交换

#### 特点

* 运行时间和输入无关。为了找出最小的元素而扫描一遍数组并不能为下一遍扫描提供信息。
* 数据移动是最小的。每次交换都会改变两个数组的元素的值，因此选择排序用了N次交换。

#### 过程图

![选择排序](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)
![选择排序](https://algs4.cs.princeton.edu/21elementary/images/selection.png)



### Insertion

[Memo Code](https://github.com/Crearns/Algorithms-4th-Demo/blob/master/chapter2/Insertion.java)


>通常人们郑礼桥拍的方法是一张一张的来，将每一张牌插入到其他已经有序的牌中的适当位置。计算机的实现中，为了给要插入的元素腾出位置，需要将其余所有元素在插入之前都向右移动一位。

对于随机排列的长度为N且主键不重复的数组，平均情况下插入排序需要~ N²/4次比较以及~ N²/4次交换。最坏情况下需要~ N²/2次比较和~ N²/2次交换，最好情况需要N-1次比较和0次交换

#### 过程图

![选择排序](https://upload.wikimedia.org/wikipedia/commons/4/42/Insertion_sort.gif)
![选择排序](https://algs4.cs.princeton.edu/21elementary/images/insertion.png)

