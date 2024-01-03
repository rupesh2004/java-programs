import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class arithmetic_operation extends JFrame implements ActionListener{
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3, b4;

    public arithmetic_operation() {

        setSize(600, 600);
        setVisible(true);
        setLayout(null);

        l1 = new JLabel("Enter Number 1");
        l1.setBounds(100,100,100,40);
        add(l1);

        l2 = new JLabel("Enter Number 2");
        l2.setBounds(100,200,100,40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(200,100,100,40);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(200,200,100,40);
        add(t2);

        b1= new JButton("Add");
        b1.setBounds(100,300,100,40);
        add(b1);
        b1.addActionListener(this);

        b2= new JButton("Sub");
        b2.setBounds(210,300,100,40);
        add(b2);
        b2.addActionListener(this);


        b3= new JButton("Mul");
        b3.setBounds(100,350,100,40);
        add(b3);
        b3.addActionListener(this);

        b4= new JButton("Div");
        b4.setBounds(210,350,100,40);
        add(b4);
        b4.addActionListener(this);

        l3=new JLabel("");
        l3.setBounds(175,400,100,40);
        add(l3);

    }

    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("Add")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l3.setText(String.valueOf(a+b));
        }
        if(s.equals("Sub")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l3.setText(String.valueOf(a-b));
        }
        if(s.equals("Mul")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l3.setText(String.valueOf(a*b));
        }
        if(s.equals("Div")){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            l3.setText(String.valueOf(a/b));
        }
    }
    public static void main(String[] args) {
        arithmetic_operation op = new arithmetic_operation();
    }
}
