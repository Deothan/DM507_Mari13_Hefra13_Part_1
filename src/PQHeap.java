public class PQHeap implements PQ{
private Element[] heap;
private int n, current = 0, max;

PQHeap(int maxElms){
    heap = new Element[maxElms];
    n = heap.length - 1;
    max = maxElms;
}

    @Override
    public Element ExtractMin() {
        sort();
        
        return heap[0];
    }

    @Override
    public void insert(Element e) {
        heap[current] = e;
        
        if(current != max){
            current++;
        }            
        else{
            System.out.println("No more room in the array");
        }
    }
    
    private void heapify(){
        for (int i = n/2; i >= 0; i--){
            minHeap(i);
        }            
    }
    
    private void minHeap(int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int min = i;
        
        if (left <= n && heap[left].key > heap[i].key)
            min = left;
        
        if (right <= n && heap[right].key > heap[min].key)        
            min = right;
 
        if (min != i)
        {
            swap(i, min);
            minHeap(min);
        }
    }  
    
    private void swap(int i, int j)
    {
        Element tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp; 
    }  
    
    private void sort(){
        heapify();        
        
        for (int i = n; i > 0; i--)
        {
            swap(0, i);
            n = n-1;
            minHeap(0);
        }
    }
}
