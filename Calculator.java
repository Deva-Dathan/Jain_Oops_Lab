import java.awt.*;
import java.awt.event.*;
 
class Calculator extends WindowAdapter implements ActionListener 
{
Frame f=new Frame("Simple Calculator");
TextField t1;
String sym,result="";
int v1=0,v2=0;

Calculator()
{
    Panel panel = new Panel();
    panel.setBounds(20,80,165,250);
    panel.setBackground(Color.gray);

    t1 = new TextField();
    t1.setBounds(30,100,150,30);
    t1.setFont(new Font("Arial", Font.PLAIN,18));

    Button b1=new Button("0");
    b1.setBounds(30,150,40,40);
    b1.addActionListener(this);

    Button b2=new Button("1");
    b2.setBounds(80,150,40,40);
    b2.addActionListener(this);

    Button b3=new Button("2");
    b3.setBounds(130,150,40,40);
    b3.addActionListener(this);

    Button b4=new Button("3");
    b4.setBounds(30,200,40,40);
    b4.addActionListener(this);

    Button b5=new Button("4");
    b5.setBounds(80,200,40,40);
    b5.addActionListener(this);

    Button b6=new Button("5");
    b6.setBounds(130,200,40,40);
    b6.addActionListener(this);

    Button b7=new Button("+");
    b7.setBounds(30,250,40,40);
    b7.addActionListener(this);

    Button b8=new Button("-");
    b8.setBounds(80,250,40,40);
    b8.addActionListener(this);

    Button b9=new Button("=");
    b9.setBounds(130,250,40,40);
    b9.addActionListener(this);

    f.add(t1);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(panel);

f.setLayout(null);
f.setVisible(true);
f.setSize(240,400);
f.addWindowListener(this);
}

public void actionPerformed(ActionEvent e)
{
    String cmd = e.getActionCommand();
    String temp;
    switch(cmd){
        case "0":
            temp = t1.getText();
            temp = temp + "0";
            t1.setText(temp);
            break;

        case "1":
            temp = t1.getText();
            temp = temp + "1";
            t1.setText(temp);
            break;

        case "2":
            temp = t1.getText();
            temp = temp + "2";
            t1.setText(temp);
            break;
        
        case "3":
            temp = t1.getText();
            temp = temp + "3";
            t1.setText(temp);
            break;
        
        case "4":
            temp = t1.getText();
            temp = temp + "4";
            t1.setText(temp);
            break;
        
        case "5":
            temp = t1.getText();
            temp = temp + "5";
            t1.setText(temp);
            break;

        case "+":
            temp = t1.getText();
            v1 = Integer.parseInt(temp);
            temp = "";
            t1.setText(temp);
            sym = "+";
            break;

        case "-":
            temp = t1.getText();
            v1 = Integer.parseInt(temp);
            temp = "";
            t1.setText(temp);
            sym = "-";
            break;

        case "=":
            String val2 = t1.getText();
            v2 = Integer.parseInt(val2);
            if(sym == "+")
            {
                String fval = String.valueOf(v1 + v2);
                t1.setText(fval);
                break;
            }
            else if(sym == "-"){
                String fval = String.valueOf(v1 - v2);
                t1.setText(fval);
                break;
            }

    }
}
 
public void windowClosing (WindowEvent e) {    
    f.dispose();    
} 

public static void main(String args[])
{
new Calculator();
}
}