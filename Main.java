

/**
 * Team Members :
 * Vikram Gopali (netId : vxg180002)
 * Sreeram Chittela (netId : sxc180025)
 * */

package vxg180002;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BinaryHeap<Integer> bh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Natural Ordering and 2 for ReverseOrdering");
        if(sc.nextInt() == 1){
            bh = new BinaryHeap<Integer>(new Integer[]{1,2,3,4,5,6,7});
        }else{
            bh = new BinaryHeap<Integer>(new Integer[]{9,8,7,6,5,4,3,2,1},Comparator.reverseOrder());
        }
        System.out.println("Enter 1 to peek, 2 to add, 3 to offer, and 4 to remove and 5 to poll");
        whileloop:
        while(sc.hasNext())
        {
            int select = sc.nextInt();
            switch(select)
            {
                //peek
                case 1:System.out.println("peeked element on the top of Binary Heap is "+bh.peek());
                    break;
                // add
                case 2: System.out.println("Enter the element you want to add.");
                    bh.add(sc.nextInt());
                    break;
                //offer
                case 3: System.out.println("Enter the element you want to offer.");
                    System.out.println("offer for the element was "+bh.offer(sc.nextInt()));
                    break;
                //remove
                case 4: System.out.println("the removed element is "+bh.remove());
                    break;
                //poll
                case 5: System.out.println("the polled element is "+bh.poll());
                    break;
                //print heap
                case 6: bh.printQueue();
                    break;
                default:System.out.println("Exiting...");
                    break whileloop;
            }
        }

    }
}


/**
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

 */