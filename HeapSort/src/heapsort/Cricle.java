package heapsort;
import javax.swing.*; 
import java.awt.*; 


public class Cricle extends JPanel{
    public void paint(Graphics g){
        setSize(500,500);
        g.drawOval(100, 100, 50, 50);
        
    }
    public static void main(String[] args){
        JFrame MainFrame = new JFrame(); 
        MainFrame.setSize(600, 600);
        Cricle Cr = new Cricle(); 
        MainFrame.add(Cr); 
        MainFrame.setVisible(true);
    }
}