import javax.swing.*;
import java.awt.event.*;

public class LoginForm implements ActionListener {
    JFrame f1 = new JFrame("Login Form");

    JLabel label_1 = new JLabel();
    JLabel label_2 = new JLabel();
    JLabel label_3 = new JLabel();
    JLabel label_4 = new JLabel();
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JButton btn1 = new JButton();

    LoginForm() {
        label_1.setText("UserName");
        label_2.setText("Password");
        label_3.setText("Results :");

        btn1.setText("Login");

        btn1.setBounds(200, 400, 100, 20);

        txt1.setBounds(300, 100, 100, 20);
        txt2.setBounds(300, 200, 100, 20);

        label_1.setBounds(100, 100, 100, 20);
        label_2.setBounds(100, 200, 100, 20);
        label_3.setBounds(100, 300, 100, 20);
        label_4.setBounds(300, 300, 100, 20);

        f1.add(label_1);
        f1.add(label_2);
        f1.add(label_3);
        f1.add(label_4);
        f1.add(txt1);
        f1.add(txt2);
        f1.add(btn1);

        f1.setSize(600, 600);
        f1.setLayout(null);
        f1.setVisible(true);

        btn1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) 
    {
        String var_1 = "", var_2 = "";
        var_1 = txt1.getText();
        var_2 = txt2.getText();
        if (var_1.equals("admin") && var_2.equals("password"))
        {
            label_4.setText("Valid User");   
        }
        else 
        {
            label_4.setText("Invalid User");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }

}