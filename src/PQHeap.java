public class PQHeap implements PQ{
private Element[] heap;

PQHeap(int maxElms){
    heap = new Element[maxElms];
}

    @Override
    public Element ExtractMin() {
        return heap[0];
    }

    @Override
    public void insert(Element e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
