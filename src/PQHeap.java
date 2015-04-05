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
            sort();
            return heap[0];
        }
        return null;
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
        for (int i = current/2; i >= 0; i--){
            minHeap(i);
        }            
    }
    
    private void minHeap(int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int min = i;
        
        if (left <= current-1 && heap[left].key < heap[i].key){
            min = left;
        }

        if (right <= current-1 && heap[right].key < heap[min].key){
            min = right;
        }        
            
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
        
        for (int i = current; i > 0; i--)
        {
            minHeap(0);
        }
    }
}
