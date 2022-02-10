# Stacks: 
## ASCII Values

Grace has a string S and a stack A.
She pushes each character of string S whose ASCII value is divisible by 3 on the stack.
**Given a string S as input print the contents of the stack by popping each character from the stack.**
 
**Function Description**

In the provided code snippet, implement the provided `popStack(...)` method using the variables to print or return the contents of the stack by popping each character from the stack as per the conditions. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”. 

There will be multiple test cases running so the Input and Output should match exactly as provided.
The base Output variable result is set to a default value of -404 which can be modified. Additionally, you can add or remove these output variables.

**Input Format**

The first line of input contains the string S.

**Sample Input**

```
abcfgh    -- denotes the string S
```

**Output Format**

Print the contents of the stack by popping each character from the stack as per the conditions.

**Sample Output**
```
fc
 ```
 
**Explanation**

The ASCII values of a,b,c,f,g,h are 97,98,99,102,103,104 respectively out of which 99 and 102 are divisible by 3.
Therefore, first c then f is pushed on the stack. The stack contents are c,f.
Printing the stack by popping each element from the stack we get `fc`.
