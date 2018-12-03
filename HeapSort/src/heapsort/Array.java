package heapsort;
import java.util.*; 

public class Array {
    int[] Arr;
    int size; 
    Scanner input = new Scanner(System.in); 
    Array(){}; 
    Array(int size){
        this.size = size; 
        Arr = new int[size]; 
        for (int i = 0; i < size; i++){
            Arr[i] = 0; 
        }
    }
    
    void SetIndexArray(int value, int index){
        if (index < size){
            Arr[index] = value; 
        }
    }
    
    void SetArray(){
        for (int i = 0; i < size; i++){
            Arr[i] = input.nextInt(); 
        }
    }
    
    void SetIndex(int Index, int value){
        Arr[Index] = value; 
    }
    
    int GetIndex(int i){
        return Arr[i]; 
    }
    
    void copy(Array A, int size){
        
        if (size == this.size){
            System.arraycopy(this.Arr, 0, A.Arr, 0, size);
        }
    }
    
    void PrintfArray(){
        for (int i = 0; i < size; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
    }
}
