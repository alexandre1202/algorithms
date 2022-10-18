# Java algorithms 
I am sharing the code I did to solve code challenges and technical interview preparations as well as useful new techniques. Maybe you can enjoy the unit test in this [repo](https://github.com/Alexandre1202/algorithms) in src directory 
## Set up for MacOS
### [Git installation](https://gist.github.com/derhuerst/1b15ff4652a867391f03#file-mac-md)
### Clone this repository in your prefered workspace 
### [Java 8 download link](https://www.oracle.com/webapps/redirect/signon?nexturl=https://download.oracle.com/otn/java/jdk/8u241-b07/1f5b5a70bf22433b84d0e960903adac8/jdk-8u241-macosx-x64.dmg)
### [IntelliJ download link](https://www.jetbrains.com/education/download/download-thanks.html?platform=mac)
Run IntelliJ and open this project with IntelliJ. In IntelliJ select the name of the project **algorithms** and click on File / Project structure Menu and you will see some configurations. 

Configure them as following:

![Project](./src/main/resources/assets/project.jpeg)
![Modules](./src/main/resources/assets/modules.jpeg)
![Libraries](./src/main/resources/assets/libraries.jpeg)
### [Homebrew installation](https://osxdaily.com/2018/03/07/how-install-homebrew-mac-os/)
### Gradle installation 
```
# brew install gradle
```
------------------------------------------
Talking about algorithms that I have learned: 
------------------------------------------
* [Buble Sort wikipedia](https://en.wikipedia.org/wiki/Bubble_sort)  
* [Java implementation](https://github.com/Alexandre1202/algorithms/blob/master/src/main/java/br/com/aab/algorithms/BubbleSort.java)
------------------------------------------
* [Selection Sort wikipedia](https://en.wikipedia.org/wiki/Selection_sort)
* [Java implementation](https://github.com/Alexandre1202/algorithms/blob/master/src/main/java/br/com/aab/algorithms/SelectionSort.java)
------------------------------------------
* [Insertion Sort wikipedia](https://en.wikipedia.org/wiki/Insertion_sort)
* [Java implementation](https://github.com/Alexandre1202/algorithms/blob/master/src/main/java/br/com/aab/algorithms/InsertionSort.java)
------------------------------------------
* [Breadth First Search wikipedia](https://en.wikipedia.org/wiki/Breadth-first_search)
* [Java implementation](https://github.com/Alexandre1202/algorithms/blob/master/src/main/java/br/com/aab/algorithms/BreadthFirstSearch.java)
------------------------------------------
* How to add a number for an array without java.lang.String. For example:
```
int[] intArray = {1, 0, 0, 4};
//The challenge asks to add 1 to intArray and if you print the array the results as following:  
1, 
0, 
0, 
5
```  
* [Java implementation](https://github.com/Alexandre1202/algorithms/blob/master/src/main/java/br/com/aab/challenge/ArraysChallenges.java)
------------------------------------------
* [All content of the code in the package br.com.aab.codingproblems belongs to Java Coding Problems book by Anghel Leonard](https://github.com/alexandre1202/algorithms/tree/master/src/main/java/br/com/aab/codingproblems) 
------------------------------------------
# Unit tests framework comparation
In this scenario of a wrong number in the unit test and I am taking advantage to show you to compare how each framework show the evaluation or assert in the console.

First we can see how *Hamcrest* show in a console:
![Console](./src/main/resources/assets/hamcrest.jpeg)
As you can see here we have on line to describe what was expected and other below for your comparation of the array. 

Second we can see how *Junit 5* show in a console:
![Console](./src/main/resources/assets/junit5.jpeg)
As you can see here we have expected and actual array, in the same line. And you have to manage to compare the int array in a different way. 

In the last example we can see how *AssertJ* show in a console:
![Console](./src/main/resources/assets/assertj.jpeg)
You can compare the expected with the actual int array one line above other aligned by each number. Another interesting point is related to the way AssertJ enable us to compare in a explicit and verbose way to clarify what you are doing when using ```.isEqualTo(...)```. There are many examples of methods for evaluation and assert to be used. 

Maybe this [Tutorial about AssertJ](https://joel-costigliola.github.io/assertj/assertj-core-quick-start.html) makes sense for you.

### Finding a missing number in a progressive arithmetic
I am providing Algorithm to find a missing number in a sequence. Take a look at FindingTheMissingNumberInTheSequence.java 
