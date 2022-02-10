# Stacks:
## Set Password

Richard wants to set a four-digit password, and you have to help him figure out those four digits.
You are given N two-digit numbers (from 10 to 99). To select 2 numbers from these N numbers, you will have to create two stacks A and B, and perform the following operations:
1. If the number is even and not a multiple of 3 (e.g. 2, 4, etc.), push it in stack A.
2. If the number is even and a multiple of 3 (e.g. 6), pop the topmost element of stack A.
    (If the stack is empty, don't pop anything).
3. If the number is odd and not a multiple of 3 (e.g. 5, 7, etc.), push it in stack B.
4. If the number is odd and a multiple of 3 (e.g. 3, 9), pop the topmost element of stack B.
     (If the stack is empty, don't pop anything).
After performing these operations on N numbers, let the topmost element of stack A be X (If the stack is empty, X=00) and the topmost element of stack B be Y (If the stack is empty, Y=00).
Print X and without giving a space, print Y. (e.g. if X=14 and Y=13 print 1413).

**Function Description**

In the provided code snippet, implement the provided setPassword(...) method using the variables to print the four-digit password. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”.

There will be multiple test cases running so the Input and Output should match exactly as provided.
The base Output variable result is set to a default value of -404 which can be modified. Additionally, you can add or remove these output variables.

**Input Format**

The first line contains the N denoting the number of 2-digit numbers.
Each of the following N lines contain 2-digit numbers.
 
**Sample Input**
```
4
11
12
13
14
 ```
 
**Constraints**
```
4<= N <= 10
10<= 2 digit number <= 99
```

**Output Format**

The output contains the values of X and Y without any space between both of them.
 
**Sample Output**
```
1413
```

**Explanation**

1) The 1st number is 11. It is odd and not divisible by 3, so push it in stack B.
2) The 2nd element is 12. It is even and divisible by 3. But stack A is empty, so don’t pop anything.
3) The 3rd element is 13. It is odd and not divisible by 3, so push it in stack B.
4) The 4th element is 14. It is even and not divisible by 3, so push it in stack A.
After performing these operations on N elements, get the topmost element of stack A (X = 14) and the topmost element of stack B (Y= 13).
Print X and Y without giving a space.
Hence, the output will be 1413.
