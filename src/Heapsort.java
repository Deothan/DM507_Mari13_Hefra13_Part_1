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
        
        Element[] elms = heap.sort();
        
        for(int i = 0; i <elms.length; i++){
            System.out.println(elms[i].key);
        }
    } 
}
