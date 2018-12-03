package heapsort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Timer;

public class HeapSortDemo{

    
    static Timer t; 
    public static void main(String[] args) {
        
//        SleepTime S = new SleepTime(); 
//        
//        S.setValueTime(5000);
//        
//        System.out.println("Chien");
        
        t = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Chien dai ca");
            }        
        }); 
        
        
        
//        heapsort Heap = new heapsort(7); 
//        Heap.addElement(7);
//        Heap.handling();
//        
//        for (int i = 0; i < 15; i++){
//            Heap.Arr[i].PrintfArray();
//        }  
        
//           
//        int[] Arr = {0,1,2,3,4,5,6}; 
//        int[] Arr2 = new int[7]; 
//        
//        System.arraycopy(Arr, 0, Arr2, 0, 7);
//        
//        for (int i = 0; i < 7; i++){
//            System.out.print(Arr2[i]);
//        }
//        try{
//            String s = "c"; 
//            int n = Integer.parseInt(s); 
//            System.out.println(n);
//            
//        }catch(NumberFormatException e){
//            System.out.println(e.getMessage());
//            System.out.println("loi");
//        }
//        System.out.println("chien dai ca");
    }
}
