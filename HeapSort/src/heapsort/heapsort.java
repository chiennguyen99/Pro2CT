package heapsort;
import java.util.*; 

public class heapsort {
    public Array A; 
    public Array[] Arr;
    public int size; 
    Scanner input = new Scanner(System.in); 
    
    heapsort(int size){
        this.size = size; 
        A = new Array(size); 
    }
    
    void addElement(int n){
        for (int i = 0; i < n; i++){
            int num; 
            num = input.nextInt(); 
            A.SetIndex(i, num);
        }
    }
    
    void Swap(int i, int j){
        int temp = A.GetIndex(i); 
        A.SetIndex(i, A.GetIndex(j));
        A.SetIndex(j, temp);
    }
    void down(int Index, int MaxIndex){
        int i = Index; 
        int j = 2*i + 1; 
        while (j <= MaxIndex){
            int k = j + 1; 
            if (k <= MaxIndex && A.GetIndex(k) > A.GetIndex(j)){
                j = k; 
            }
            if (A.GetIndex(i) < A.GetIndex(j)){
                Swap(i, j); 
                i = j; 
                j = 2*i + 1; 
            }else {
                break; 
            }
        }
    }
    void handling(){
        int k = A.size - 1; 
        Arr = new Array[15]; 
        int dem = 0; 
       
        for (int i = k/2 - 1; i >= 0; i--){
         
            down(i, k); 
           
            Arr[dem] = new Array(size); 
            
            A.copy(Arr[dem], size);
            
            dem++; 
        }
        for (int i = k; i >= 1; i--){
            
            Swap(0, i); 
            Arr[dem] = new Array(size); 
            
            A.copy(Arr[dem], size);
            
            dem++;
            
            down(0, i - 1); 
            
            Arr[dem] = new Array(size); 
            
            A.copy(Arr[dem], size);
            
            dem++; 
            
        }
    }
    void print(){
        A.PrintfArray();
    }
}
