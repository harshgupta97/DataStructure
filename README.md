# DataStructure

## Array

### Custom dynamic array class
Array class with the following method
1. insert(int item)
2. removeAt(int index)
3. indexOf(int item)
3. max()
4. intersect()
5. reverse()
6. insertAt(int item, int index)

### Built-in dynamic array
1. Vector<E> - when full grow 100% of it size, synchronous (single threaded)
2. ArrayList<E> - when full grow 50% of it size, not synchronous

### Runtime complexity of some operation in array

Lookup by index O(1),
Lookup by value O(n),
Insert O(n),
Delete O(n)

## LinkedList

Classes needed
1. LinkedList
2. Node(int value)

LinkedList class with following method
1. addLast(int item); O(1)
2. addFirst(int item); O(1)
3. indexOf(int item); O(n)
4. contains(int item); O(n)
5. removeFirst(); O(1)
6. removeLast(); O(n)
7. size(); O(1) / O(n) Complexity based on implementation of this method
8. toArray(); O(n)
9. reverse(); O(n)
10. getKthNodeFromTheEnd(int k); O(n)

### Array vs Linked List

Space complexity
1. Static array have fixed size
2. Dynamic grow by 50-100%
3. Link list dose not waste space
4. Use array if know before hand the size of array;
5. new ArrayList(100)

Runtime complexity

Factor | Array | LinkedList
--- | --- | ---
Lookup by Index | O(1) | O(n)
Lookup by value | O(n) | O(n)
Insert at beginning | O(n) | O(1)
Insert at end | O(n) | O(1)
Insert at middle | O(n) | O(n)
Delete at Beginning | O(n) | O(1)
Delete at End | O(n) | O(n)
Delete at middle | O(n) | O(n)

Types of LinkedList
1. Single
2. Double
3. Circular


