public class PQHeap implements PQ{
private Element[] heap;
private int current = 0, max;

PQHeap(int maxElms){
    heap = new Element[maxElms];
    max = maxElms;
}

    @Override
    public Element ExtractMin() {
        if(heap[0] != null){
            return heap[0];
        }
        return null;
    }

    @Override
    public void insert(Element e) {
        if(current < max){
            heap[current] = e;
            current++;
            heapify(current);
        }            
        else{
            System.out.println("No more room in the array");
        }
    }
    //Build min heap
    private void heapify(int n){
        for (int i = n/2; i >= 0; i--){
            minHeap(i, n);
        }            
    }
    //Min heap
    private void minHeap(int parent, int n)
    { 
        int left = 2*parent ;
        int right = 2*parent + 1;
        int min = parent;
        
        if (left <= n-1 && heap[left].key < heap[parent].key){
            min = left;
        }

        if (right <= n-1 && heap[right].key < heap[min].key){
            min = right;
        }        
            
        if (min != parent)
        {
            swap(parent, min);
            minHeap(min, n);
        }
    }  
    
    private void swap(int i, int j)
    {
        Element tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp; 
    }  
    
    public void sort(){
        heapify(current);        
        
        for (int i = current-1; i >= 0; i--)
        {
            swap(0, i);
            minHeap(0, i-1);
        }
    }
}
