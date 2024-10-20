# Testing Lab
Testing Lab for CSE 116

## About
This lab activity is meant to get you familiar with testing with JUnit as well as a general idea of how grading tests works. Your goal will be to write tests that successfully catch bugs in some code that is given to you.

## Directory (important)
The only file you will modify in this lab is located at `src/java/lab/tests/TestProblemSet.java`. In this file, you will write JUnit tests for the methods that have already been written in `src/java/lab/ProblemSet.java`. 

One basic test `sampleTest()` has already been given to you to demonstrate how methods from `ProblemSet` should be called in your tests (this is different than how they are called in Task 1).

`TestProblemSet.java` also contains a pre-written test called `testBad()`. It determines what bugs the tests you wrote catch (explained more in Feedback). You don't have to worry about the code in the test; just know that it'll pass once your testing is sufficient.

### Directory (less important)

`bad/` contains several variations of `ProblemSet` with intentionally broken versions of the methods. **Do not fix the bugs.** `testBad()` relies on these broken versions to check if your tests work. You aren't expected to fully understand how the bad tests work.

`tests/TestBad.java` contains code that is only used by `testBad()` and should not be modified in any way. Just pretend it's not even there (unless you're really curious).

## ProblemSet
This class contains several methods that you will need to write tests for. These methods are already functional and don't need to be modified.
### `addNums()`
This method will simply add two ints together and return the sum.
Ex: `addNums(1, 2) == 3`
### `reverseList()`
This method will take in an `ArrayList` and return another `ArrayList` with the same elements as the first in reverse order. This will be the hardest one to test. 
Ex: `reverseList([1, 2, 3, 4, 5]) == [5, 4, 3, 2, 1]` (Note: you cannot directly pass in an ArrayList like this, you will need to create one)
### `numOccurances()`
This method will take in an `ArrayList` and an int, and will return another int equal to the number of times the argument appears in the ArrayList.
Ex: `occurances([1, 2, 2, 2, 3, 4, 5], 2) == 3` (Note: you cannot directly pass in an ArrayList like this, you will need to create one)

## Feedback
For each bug you catch, the console will output in green "`Your test "[test name]" caught the bug: [bug description]`" If your code fails to catch a bug, it will output in red "`Your testing didn't catch the bug: [bug descripton]`". If your tests miss any bug(s), `testBad()` will fail with the message "`java.lang.AssertionError: Your testing is incomplete.`"
You'll know you're done once every test in `TestProblemSet.java`, including any that you wrote and `testBad()`, passes. 

Note: since the code in `ProblemSet` is already correct, if you write a test and it fails the test itself must be the problem. 
