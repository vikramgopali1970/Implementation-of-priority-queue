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
        System.out.println("Enter 1 to Add, 2 to Offer, 3 to Remove, and 4 to Poll");
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
