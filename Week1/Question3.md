# Array Operation: 
## Cost Of The Array

You are given an array A of size `N`. The cost of an element at the ith index of the array is given as `i * A[i]` .

Finish implementing the method `costOfArray(...)` to correctly return the total cost of the array according to the above equation. 

> IMPORTANT!!!
> 
> In this scenario let's assign 1 as the first index of the array (i.e. the array is 1-based).
> 
> The total cost of the array is Summation of `i * A[i]` , from i = 1, to i = N, where N is the size of the array. 
> 
> For example: The array is {2,3,1,4}. The cost will be: 1*2 + 2*3 + 3*1 + 4*4 = 27

 
**Input Format**

The first line contains a single integer N, denoting the size of the array.
The next N lines of integers contain elements of array, A.

**Constraints**
```
1 <= N <= 25
1 <= A[i] <= 1000
```

**Output Format**

The output contains a single integer denoting the total cost of the array
 
**Sample Input**
```
5
4
3
2
1
 ```
 
**Sample Output**
```
35
```

**Explanation**

The given array is {5,4,3,2,1}. The total cost is = 1*5 + 2*4 + 3*3 + 4*2 + 5*1 = 35
Hence the output is 35.
