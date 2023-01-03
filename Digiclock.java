import javax.swing.*;
import java.text.*;
import java.util.*;
import java.awt.Font;

public class Digiclock extends Thread{
    JFrame f;
    Thread t=null;
    String timeString="";
    JLabel b;
    
    Digiclock()
    {
        f=new JFrame("Digital Clock");
        t=new Thread(this);
        t.start();
        b = new JLabel();
        b.setBounds(100,100,300,50);
        b.setFont(new Font("Arial", Font.PLAIN, 25));
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try
        {
            while(true)
            {
                Calendar cal = Calendar.getInstance();
                Date time = cal.getTime();
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                timeString = formatter.format(time);
                printTime();
            }
        }

        catch(Exception e)
        { }
        
    }
public void printTime()
{
    b.setText(timeString);
}
public static void main(String args[])
{
    new Digiclock();
}
}