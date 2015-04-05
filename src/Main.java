import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );        
        System.out.println("Heap Sort Test\n"); 
       
        /* Accept number of elements */
        System.out.println("Enter number of integer elements");  
       
        /* Make array of n elements */
        int size = scan.nextInt();
        PQHeap heap = new PQHeap(size);
        
        /* Accept elements */
        for (int i = 0; i < size; i++){
            System.out.println("\nEnter "+ (size-i) +" integer elements");
            heap.insert(new Element(scan.nextInt(), new Object()));
        }
        System.out.println(heap.ExtractMin().key);
    } 
}
