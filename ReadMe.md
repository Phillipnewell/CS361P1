# P1 CS361-TheoryOfComputation

* Author: Phillip Newell
* Author: Chinwendum Njoku 
* Class: CS361 Section 001
* Semester: Fall 2021

## Overview

We created a project that takes in deterministic finite automatas and
pushes out the 5-tuple of the DFA. After the 5-tuple is printed it will
print out yes or no to whether a given set of alphabet passes.

## Compiling and Using

To compile, you need two commands: javac fa/*.java javac fa/dfa/*.java
Then to use: java fa.dfa.DFADriver ./tests/p1tc1.txt
The code should only take one argument at a time.
To undo the compile: find -name "*.class" -delete


## Discussion

Biggest work stoppage for us was when we needed to refer to a
DFAState inside of a set of DFAStates. I had to talk to some other
students about how to do it and came to a solution that we make
a map that uses names as a key value for the correlating DFAState.

One of our mistakes was making the mapping of our transition states
in DFA.  When we put hashmap in DFAState instead it made a lot more 
sense because only DFAStates need to know what they do with characters.
You could say this was a click.

At first, I thought the e in test 3 was meant to test a wrong character
that didn't belong in the alphabet and luckily I got notified by a friend
when we tried a new test together where start state and final state was
the same state, then e was a test that had to pass.

## Testing

You are expected to test your projects before submitting them for
final review. Pretend that your instructor is your manager or 
customer at work. How would you ensure that you are delivering a 
working solution to their requirements?

We confirmed that all 3 tests given were passed and then we created
a 4th test where first state was final.  One of the transitions tested
was e and made sure it processed the e correctly among many other strings.

## Sources used

https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html


[Here is some help creating links](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#links)

----------
This README template is using Markdown. To preview your README output, you can copy your file contents to a Markdown editor/previewer such as [https://stackedit.io/editor](https://stackedit.io/editor).
