import java.awt.*;
import java.awt.event.*;

public class EmployeProfile extends WindowAdapter implements ActionListener {
    Frame f = new Frame();
    Label first_name, last_name, age, qualification, proficiency, salary;
    TextField t1, t2, t3, t4;
    Choice choice;
    List list;
    Button b;
    Checkbox cb;

    EmployeProfile() {
        f.setTitle(("Employe Profile"));

        Label header = new Label("EMPLOYE PROFILE");
        header.setAlignment(Label.CENTER);
        header.setFont(new Font("Arial", Font.PLAIN, 25));
        header.setBounds(100,20,400,100);
        f.add(header);

        first_name = new Label("First name");
        first_name.setBounds(70, 120, 80, 20);
        f.add(first_name);
        t1 = new TextField();
        t1.setBounds(170, 120, 200, 30);
        f.add(t1);

        last_name = new Label("Last Name");
        last_name.setBounds(70, 170, 80, 20);
        t2 = new TextField();
        t2.setBounds(170, 170, 200, 30);
        f.add(last_name);
        f.add(t2);

        age = new Label("Age");
        age.setBounds(70, 220, 80, 20);
        t3 = new TextField();
        t3.setBounds(170, 220, 70, 25);
        f.add(age);
        f.add(t3);

        qualification = new Label("Qualification");
        qualification.setBounds(70, 270, 100, 20);
        choice = new Choice();
        choice.setBounds(170, 270, 100, 30);
        f.add(qualification);
        f.add(choice);
        choice.add("Qualification");
        choice.add("BCA");
        choice.add("MCA");
        choice.add("PhD");
        choice.add("M.Tech");

        proficiency = new Label("Proficiency");
        proficiency.setBounds(70, 300, 100, 20);
        list = new List(5, true);
        list.setBounds(170, 300, 100, 50);
        f.add(list);
        f.add(proficiency);
        list.add("Java");
        list.add("C++");
        list.add("C");
        list.add("C#");
        list.add("Python");

        salary = new Label("Expected Salary");
        salary.setBounds(70, 360, 100, 20);
        t4 = new TextField();
        t4.setBounds(170, 360, 100, 30);
        f.add(salary);
        f.add(t4);

        cb = new Checkbox(" Are you Fresher?");
        cb.setBounds(70, 420, 150, 30);
        f.add(cb);

        b = new Button("Submit");
        b.setBounds(120, 480, 80, 40);
        f.add(b);

        f.addWindowListener(this);
        f.setSize(600, 800);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == b) 
        {
            String name = t1.getText() + " " + t2.getText();
            System.out.println("First Name : "+name);
            String age = t3.getText();
            System.out.println("Age : "+age);
            String qualification = choice.getSelectedItem();
            System.out.println("Qualification : "+qualification);
            String proficiency_sel[] = list.getSelectedItems();
            String temp = "";
            for (int i = 0; i< proficiency_sel.length; i++){
                temp = temp + "," + proficiency_sel[i];
            }
            System.out.println("Proficiency : "+temp.substring(1));
            String salary_exp = t4.getText();
            System.out.println("Expected Salary : "+salary_exp);
            String check_uncheck = (cb.getState() ? "Yes" : "No");
            System.out.println("Fresher : "+check_uncheck);
        }

    }


    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new EmployeProfile();
    }
}
