import java.awt.*;    
import java.awt.event.*; 
import java.awt.Font; 

public class LayoutForm extends WindowAdapter implements ActionListener{    
Frame f = new Frame();
TextField t1;
Choice choice;
Button b;  
Label out; 

LayoutForm()
{    
    Label l1 = new Label("Enter The Data :");
    f.add(l1);
    
    t1 = new TextField();
    f.add(t1);
        
    Label fontstyle = new Label("Choose The Font Style :");
    fontstyle.setBounds(50, 170, 150, 20);
    choice = new Choice();
    f.add(fontstyle);
    f.add(choice);
    choice.add("Serif PLAIN");
    choice.add("Serif BOLD");
    choice.add("Courier PLAIN");
    choice.add("Courier BOLD");

    Label resultdisplay = new Label("Result :");
    f.add(resultdisplay);


    b = new Button("Display");
    f.add(b);
    
    f.addWindowListener(this);
    f.setLayout(new GridLayout(4, 2));  
    f.setSize(500,500);    
    f.setVisible(true); 
    b.addActionListener(this);   
}    

public void actionPerformed(ActionEvent e) 
{
    if (e.getSource() == b) 
    {
        String name = t1.getText();
        // System.out.println(name);
        String fontstyle = choice.getSelectedItem();
        // System.out.println(fontstyle);

        if(fontstyle == "Serif PLAIN")
        {
            out = new Label();
            out.setText("");
            out.setFont(new Font("Serif", Font.PLAIN, 20));
            out.setText(name);
            out.setBounds(250, 230, 110, 20);
            f.add(out);
        }
        else if(fontstyle == "Serif BOLD")
        { 
            out = new Label();
            out.setText("");
            out.setFont(new Font("Serif", Font.BOLD, 20));
            out.setText(name);
            out.setBounds(250, 230, 110, 20);
            f.add(out);
        }
        else if(fontstyle == "Courier PLAIN")
        { 
            out = new Label();
            out.setText("");
            out.setFont(new Font("Courier", Font.PLAIN, 20));
            out.setText(name);
            out.setBounds(250, 230, 110, 20);
            f.add(out);
        }
        else if(fontstyle == "Courier BOLD")
        {
            out = new Label();
            out.setText("");
            out.setFont(new Font("Courier", Font.BOLD, 20));
            out.setText(name);
            out.setBounds(250, 230, 110, 20);
            f.add(out);  
        }
    }          
 
}

public void windowClosing (WindowEvent e) {    
    f.dispose();    
} 
public static void main(String[] args) {    
    new LayoutForm();    
}    
}