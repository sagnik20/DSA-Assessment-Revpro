# Strings:
## Count of unique characters

You are given a string that consists of only * and ? characters.
In a given format, each lower case alphabet has been assigned a number according to its occurrence in the English alphabet series in the following format i.e. a = 1, b = 2, c = 3 ……..m = 13….z = 26.
The string has a minimum length of 2 and a maximum length of 52 characters. 

**You have to calculate the total count of * and ? in a given string and print the alphabet corresponding to the count of  *  followed by the alphabet corresponding to the count of ? **

**Example**
```
If ***?? is a given string, the string count of * is 3 and the count of ? of is 2.
In the alphabet format, 3 corresponds to c, and 2 corresponds to b.
Hence, the final answer is c b.  
```

**Note**

1. The string consists of only * and ? characters. 
2. The minimum length of the string is 2 and the maximum length is 52. 

**Function Description**

In the provided code snippet, implement the provided `count(...)` method using the variables to print the alphabet corresponding to the count of  "*"  followed by the alphabet corresponding to the count of "?". You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”.  
 
There will be multiple test cases running so the Input and Output should match exactly as provided. 
The base Output variable result is set to a default value of -404 which can be modified. Additionally, you can add or remove these output variables. 

**Input Format**

The input contains a string consisting of * and ? 

**Sample Input**
```
***??   -- denotes string
```

**Constraints**
```
2<=Length of given string<=52. 
1<= Count of  * <=26  
1<= Count of  ? <=26  
```

**Output Format**

The output should print two characters corresponding to the count of * and ? in a given string separated with space.
 
**Sample Output**
```
c b
```

**Explanation**
```
Given string is ***?? 
Count of  * in given string  = 3. 
Count of  ? in given string  = 2. 
In the alphabet format, we have a = 1, b = 2 ,c = 3.............z = 26. 
Here, 3 corresponds to c, and 2 corresponds to b.
Hence, the answer is c b. 
```
