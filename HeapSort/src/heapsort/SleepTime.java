package heapsort;


public class SleepTime extends Thread{
    int value; 
    void setValueTime(int value){
        this.value = value; 
    }
    void TestSleep(){

        try {
            
            Thread.sleep(value);
            
        } catch(InterruptedException e){
            
            System.out.println(e);
            
        }

    }
 
    public static void main(String args[]) {
        SleepTime t1 = new SleepTime();
            
        System.out.println("chien nguyen");
        
        t1.TestSleep();
        
        System.out.println("OK");
    }

}
