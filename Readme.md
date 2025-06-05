# Data structures

Memory structures that allow data to be stored in the memory in an effective and efficient manner. 

**Usages**
- Efficient Data Access
- Data Organization
- Data Processing
- Memory Management
- Business Logic Optimization

## Types of Data Structures

**Linear DS**
- Arrays
- Linked Lists
- Stack
- Queue

**Non Linear DS**
- Tree
- Heap
- Graph

**Hash Based DS**
- HashTable/HashMap

**Special DS**
- Trie(Prefix Tree)

Choosing a DS, depends on
- Type of operations (searching, sorting, insert/update/delete)
- Frequency of the operations
- Size of data
- Memory restrictions
- Time complexity


### Linear DS

Each element in this DS is arranged in a sequential manner, with each element getting connected to the next or the 
previous element.

**Arrays**

Static data structure, uses continous memory locations. Arrays uses indexed data access. Arrays are used to 
maintain small static lists, matrix based operations in ML, AI programming.

**Linked List**

Collection of elements(nodes), it is dynamic in nature, sequential access, where each node contains
- Data
- Pointer (to the next or the previous adjacent element)

Types:
- Single Linked List:  `each node points to the next node`
- Doubly Linked List: `each node points to the next and previous nodes`
- Circular Linked List: `last node points to the first node`

**Stack**

A linear DS which works using **LIFO**, Last In First Out principle.

Main operations:
- `push()`
- `pop()`
- `peek()`

**Queue**

A linear DS which works using **FIFO**, First In First Out principle.

Main operations:
- `enqeue()`
- `dequeue()`
- `peek()`

### Non Linear DS

**Trees**

Trees are non linear, hierarchical data structures consisting of elements called nodes.
- topmost node is called the root 
- each node contains some data and references to the child nodes
- non cyclic
- we use them in file systems, browser DOM, database indexes

Types:
- Binary Trees: each node has max two child nodes
- Binary Search Tree: same as B-Tree with Left Node < Root < Right Node
- AVL Tree
- Trie

### Hash based DS

Uses a hash function to convert a key into an index of an array, allows fast access, insertions, deletions

## Sorting Algorithms

Sorting allows us to order data in either ascending or descending manner 

### Bubble Sort

- Repeatedly compare adjacent elements
- Swap them if they are in the wrong order
- Each pass `bubbles` the largest element at the end
- Reduce the range and repeat the process till no more comparison is needed

### Selection Sort
- Find the smallest element in the array

### Quick Sort
- Divide and conquer algorithm
- Choose a pivot element(last element in the array)
- Rearrange the elements such that
  - elements smaller than pivot are placed before pivot
  - elements greater that pivot are placed after pivot

## Searching Algorithms


