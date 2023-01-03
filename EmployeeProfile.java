import java.awt.*;
import java.awt.event.*;

public class EmployeeProfile extends WindowAdapter implements ActionListener {
    Frame f = new Frame();
    Label f_name, l_name, age, quali, prof, sal, rname, rage, rquali, rsal, rstate, rprof;
    TextField t1, t2, t3, t4;
    Choice ch;
    List li;
    Button b;
    Checkbox cb;

    EmployeeProfile() {
        f.setTitle(("Employee Profile"));
        f_name = new Label("First name");
        f_name.setBounds(70, 50, 80, 20);
        f.add(f_name);
        t1 = new TextField();
        t1.setBounds(170, 50, 200, 30);
        f.add(t1);
        l_name = new Label("Last Name");
        l_name.setBounds(70, 90, 80, 20);
        t2 = new TextField();
        t2.setBounds(170, 90, 200, 30);
        f.add(l_name);
        f.add(t2);
        age = new Label("Age");
        age.setBounds(70, 130, 80, 20);
        t3 = new TextField();
        t3.setBounds(170, 130, 70, 25);
        f.add(age);
        f.add(t3);
        quali = new Label("Qualification");
        quali.setBounds(70, 170, 100, 20);
        ch = new Choice();
        ch.setBounds(170, 170, 100, 30);
        f.add(quali);
        f.add(ch);
        ch.add("Qualification");
        ch.add("BCA");
        ch.add("MCA");
        ch.add("PhD");
        ch.add("M.Tech");
        prof = new Label("Proficiency");
        prof.setBounds(70, 210, 100, 20);
        li = new List(5, true);
        li.setBounds(170, 210, 100, 50);
        f.add(li);
        f.add(prof);
        li.add("Java");
        li.add("C++");
        li.add("C");
        li.add("C#");
        li.add("Python");
        sal = new Label("Expected Salary");
        sal.setBounds(70, 280, 100, 20);
        t4 = new TextField();
        t4.setBounds(170, 280, 100, 30);
        f.add(sal);
        f.add(t4);
        cb = new Checkbox(" Are you Fresher?");
        cb.setBounds(70, 320, 150, 30);
        f.add(cb);
        b = new Button("Submit");
        b.setBounds(120, 360, 80, 40);
        f.add(b);
        rname = new Label();
        rname.setBounds(400, 50, 250, 30);
        f.add(rname);
        rage = new Label();
        rage.setBounds(400, 90, 100, 30);
        f.add(rage);
        rsal = new Label();
        rsal.setBounds(400, 130, 100, 30);
        f.add(rsal);
        rstate = new Label();
        rstate.setBounds(400, 170, 100, 30);
        f.add(rstate);
        rquali = new Label();
        rquali.setBounds(400, 210, 100, 30);
        f.add(rquali);
        rprof = new Label();
        rprof.setBounds(400, 260, 200, 30);
        f.add(rprof);

        f.addWindowListener(this);
        f.setSize(800, 800);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String name = t1.getText() + " " + t2.getText();
            String ag = t3.getText();
            String qualification = ch.getSelectedItem();
            String proficiency[] = li.getSelectedItems();
            String temp = "";
            for (int i = 0; i < proficiency.length; i++) {
                temp = temp + "," + proficiency[i];
            }

            String salary = t4.getText();
            String chec_uncheck = (cb.getState() ? "Fresher" : "Experienced");
            rname.setText("Name: " + name);
            rage.setText("Age: " + ag);
            rsal.setText("Salary:" + salary);
            rstate.setText(chec_uncheck);
            rquali.setText("Qualification " + qualification);
            rprof.setText("Proficiency: " + temp.substring(1));

        }

    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new EmployeeProfile();
    }
}
