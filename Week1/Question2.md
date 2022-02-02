# Array Operations: 
## Divisible by 25

You have an array of size **N** containing non-negative integers.
You want to check if the number formed by concatenating all the given **N** numbers is divisible by 25 or not.
**Print "Yes" if it is divisible and "No" if it's not.**
 
**Function Description**

In the provided code snippet, implement the provided `safeCheck(...)` method using the variables to check if the number formed by concatenating all the given N numbers is divisible by 25 or not. You can write your code in the space below the phrase _“WRITE YOUR LOGIC HERE”_ .

There will be multiple test cases running so the Input and Output should match exactly as provided.
The base Output variable `result` is set to a default value of `-404` which can be modified. Additionally, you can add or remove these output variables.

**Input Format**

The first line contains an integer _t_ denoting the number of test cases.
The first line of each test case contains an integer _N_ denoting the number of elements.
The next line contains _N_ space-separated integers.

**Sample Input**

```
3
6
90 46 16 91 62 20
6
38 50 32 3 50 0
6
89 86 97 13 38 50
```

**Constraints**

```
1≤ t ≤ 1000
1≤ N ≤ 1000
1≤ A[i] ≤ N
```

**Output Format**

The output contains "Yes" or "No" depending upon whether the number is divisible by 25 or not.

**Sample Output**

```
No
Yes
Yes
 ```
 
**Explanation**

In the first test case, the number formed is 904616916220  which is not divisible by 25
In the second test case, the number formed is 3850323500 which is divisible by 25.
In the third test case, the number formed is 898697133850 which is divisible by 25.
Hence, the output is:
```
No
Yes
Yes
```
