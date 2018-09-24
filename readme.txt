
Team Members :
Vikram Gopali (netId : vxg180002)
Sreeram Chittela (netId : sxc180025)




Compiling the code in IntelliJ Idea:
->create a empty project.
->Navigate to 'projectName'->src folder.
->paste the unzipped folder inside the src folder.
->In the above menu select Run->Run...
->select the 'className'
->Running the code:

Initially the doubly linked list gets initialized with elements from 0 to 9.
Option 1 : get the peeked element.(Returns the root element always.)
Option 2 : Add an element into the heap.(Throws Array Index Out of Bound if the heap is full.)
Option 3 : Offer an element into the heap.(Throws no error but returns false if insertion is not successful.)
Option 4 : Removes an element from the heap.(Throws No such element exception if the heap is empty.)
Option 5 : Polls an element from the heap.(Throws no error but returns null if it is empty.)
Option 6 : Print the heap elements.

Sample Input :
If natural order is chosen,
1,2,3,4,5,6,7
If Reverse Order is chosen,
9,8,7,6,5,4,3,2,1

Sample Output_1 :
Enter 1 for Natural Ordering and 2 for ReverseOrdering
1
Enter 1 to peek, 2 to add, 3 to offer, and 4 to remove and 5 to poll
1
peeked element on the top of Binary Heap is 1
2
Enter the element you want to add.
12
Exception in thread "main" java.lang.IndexOutOfBoundsException
	at vxg180002.BinaryHeap.add(BinaryHeap.java:41)
	at vxg180002.Main.main(Main.java:28)

Process finished with exit code 1



Sample Output_2 :
Enter 1 for Natural Ordering and 2 for ReverseOrdering
1
Enter 1 to peek, 2 to add, 3 to offer, and 4 to remove and 5 to poll
1
peeked element on the top of Binary Heap is 1
3
Enter the element you want to offer.
23
offer for the element was false
4
the removed element is 1
1
peeked element on the top of Binary Heap is 2
4
the removed element is 2
1
peeked element on the top of Binary Heap is 3
6
Queue:
3
4
6
7
5
Priority queue size is now 5
5
the polled element is 3
5
the polled element is 4
6
Queue:
5
7
6
Priority queue size is now 3
2
Enter the element you want to add.
44
6
Queue:
5
7
6
44
Priority queue size is now 4

Sample Output_3
Enter 1 for Natural Ordering and 2 for ReverseOrdering
2
Enter 1 to peek, 2 to add, 3 to offer, and 4 to remove and 5 to poll
1
peeked element on the top of Binary Heap is 9
1
peeked element on the top of Binary Heap is 9
4
the removed element is 9
4
the removed element is 8
4
the removed element is 7
4
the removed element is 6
6
Queue:
5
3
4
2
1
Priority queue size is now 5
3
Enter the element you want to offer.
0
offer for the element was true
6
Queue:
5
3
4
2
1
0
Priority queue size is now 6
