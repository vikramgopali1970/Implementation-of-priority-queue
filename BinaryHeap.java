// Starter code for bounded-size Binary Heap implementation
// Changed signature of heapSort changing <T> to <T extends Comparable<? super T>>
// poll returns null if pq is empty (not false)

package vxg180002;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BinaryHeap<T extends Comparable<? super T>> {
    T[] pq;
    Comparator<T> comp;
    int size;
    // Constructor for building an empty priority queue using natural ordering of T
    public BinaryHeap(T[] q) {

        // Use a lambda expression to create comparator from compareTo
        this(q, (T a, T b) -> a.compareTo(b));
    }

    // Constructor for building an empty priority queue with custom comparator
    public BinaryHeap(T[] q, Comparator<T> c) {
        System.out.println("hereeeeeee ");
        pq = q;
        comp = c;
        this.size = q.length;
    }

    /** Build a priority queue with a given array q, using q[0..n-1].
     *  It is not necessary that n == q.length.
     *  Extra space available can be used to add new elements.
     *  Implement this if solving optional problem.  To be called from heap sort.
     */
    private BinaryHeap(T[] q, Comparator<T> c, int n) {
        System.out.println("this contructor with T[] q, Comparator<T> c, int n argumennt");
        pq = q;
        comp = c;
        // You need to add more code here to build queue
    }

    public void add(T x) { /* throw exception if pq is full */
        if(this.size == pq.length){
            throw new IndexOutOfBoundsException();
        }
        pq[this.size] = x;
        percolateUp(this.size);
        this.size++;
    }

    public boolean offer(T x) { /* return false if pq is full */
        if(this.size == pq.length)
            return false;
        this.add(x);
        return true;
    }

    public T remove() { /* throw exception if pq is empty */
        T min;
        if (this.size == 0){
            throw new NoSuchElementException();
        }else if(this.size == 1){
            this.size--;
            return pq[0];
        }else{
            min =  pq[0];
            pq[0] = pq[this.size-1];
            this.size--;
            this.percolateDown(0);
            return min;
        }
    }

    public T poll() { /* return null if pq is empty */
        if(this.size == 0)
            return null;
        // remove only if there is an element in the heap
        return this.remove();
    }

    public T peek() { /* return null if pq is empty */
        if(this.size == 0)
            return null;
        return pq[0];
    }

    /** pq[i] may violate heap order with parent */
    void percolateUp(int i) { /* to be implemented */
        T temp = pq[i];
        int parent = parent(i);
        while(i > 0 && this.comp.compare(pq[parent],temp)>0){
            pq[i] = pq[parent];
            i = parent;
            parent = parent(i);
        }
        pq[i] = temp;
    }

    /** pq[i] may violate heap order with children */
    void percolateDown(int i) { /* to be implemented */
        T temp = pq[i];
        int child = leftChild(i);
        while(child < this.size){
            //check which child is smaller of the 2 children and select it
            if(child < this.size && this.comp.compare(pq[child],pq[child+1]) > 0){
                child++;
            }
            if(this.comp.compare(temp,pq[child])<0){
                break;
            }
            pq[i] = pq[child];
            i = child;
            child = leftChild(i);
        }
        pq[i] = temp;
    }

    // Assign x to pq[i].  Indexed heap will override this method
    void move(int i, T x) {
        pq[i] = x;
    }

    public void printQueue()
    {
        System.out.println("Queue:");
        for(int x=0;x<this.size;x++)
        {
            System.out.println(pq[x]);
        }
        System.out.println("Priority queue size is now "+size);
    }

    int parent(int i) {
        return (i-1)/2;
    }

    int leftChild(int i) {
        return 2*i + 1;
    }

// end of functions for team project




// start of optional problem: heap sort (Q2)

    /** Create a heap.  Precondition: none. 
     *  Implement this ifsolving optional problem
     */
    void buildHeap() {
    }

    /* sort array arr[].
       Sorted order depends on comparator used to buid heap.
       min heap ==> descending order
       max heap ==> ascending order
       Implement this for optional problem
     */
    public static<T extends Comparable<? super T>> void heapSort(T[] arr, Comparator<T> c) { /* to be implemented */
    }

    // Sort array using natural ordering
    public static<T extends Comparable<? super T>> void heapSort(T[] arr) {
        heapSort(arr, (T a, T b) -> a.compareTo(b));
    }
// end of optional problem: heap sort (Q2)



// start of optional problem: kth largest element (Q3)

    public void replace(T x) {
	/* TO DO.  Replaces root of binary heap by x if x has higher priority
	     (smaller) than root, and restore heap order.  Otherwise do nothing. 
	   This operation is used in finding largest k elements in a stream.
	   Implement this if solving optional problem.
	 */
    }

    /** Return the kth largest element of stream using custom comparator.
     *  Assume that k is small enough to fit in memory, but the stream is arbitrarily large.
     *  If stream has less than k elements return null.
     */
    public static<T extends Comparable<? super T>> T kthLargest(Iterator<T> stream, int k, Comparator<T> c) {
        return null;
    }

    /** Return the kth largest element of stream using natural ordering.
     *  Assume that k is small enough to fit in memory, but the stream is arbitrarily large.   
     *  If stream has less than k elements return null.
     */
    public static<T extends Comparable<? super T>> T kthLargest(Iterator<T> stream, int k) {
        return kthLargest(stream, k, (T a, T b) -> a.compareTo(b));
    }
// end of optional problem: kth largest element (Q3)

}