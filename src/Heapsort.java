import java.util.Scanner;

public class Heapsort {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );

        String[] input = scan.nextLine().split(" ");
        PQHeap heap = new PQHeap(input.length);
        
        for(String s : input){
            heap.insert(new Element(Integer.parseInt(s), new Object()));
        }

        System.out.println(heap.ExtractMin().key);
        heap.sort();
    } 
}
