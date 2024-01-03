import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class registrationForm extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public registrationForm() {
        setTitle("Registration Form");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);

        l1 = new JLabel("Registration Form");
        l1.setBounds(190, 30, 300, 80);
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setForeground(Color.decode("#5D3587"));
        add(l1);

        l2 = new JLabel("Enter Name");
        l2.setBounds(120, 120, 150, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 25));
        l2.setForeground(Color.decode("#5D3587"));
        add(l2);

        t1 = new JTextField();
        t1.setBounds(320, 130, 300, 40);
        t1.setFont(new Font("Arial", Font.BOLD, 20));
        add(t1);

        l3 = new JLabel("Enter E-Mail");
        l3.setBounds(120, 205, 150, 50);
        l3.setFont(new Font("Arial", Font.BOLD, 25));
        l3.setForeground(Color.decode("#5D3587"));
        add(l3);

        t2 = new JTextField();
        t2.setBounds(320, 210, 300, 40);
        t2.setFont(new Font("Arial", Font.BOLD, 20));
        add(t2);

        l4 = new JLabel("Enter Mobile No.");
        l4.setBounds(120, 285, 150, 50);
        l4.setFont(new Font("Arial", Font.BOLD, 25));
        l4.setForeground(Color.decode("#5D3587"));
        add(l4);

        t3 = new JTextField();
        t3.setBounds(320, 290, 300, 40);
        t3.setFont(new Font("Arial", Font.BOLD, 20));
        add(t3);

        l5 = new JLabel("Enter Password");
        l5.setBounds(120, 365, 150, 50);
        l5.setFont(new Font("Arial", Font.BOLD, 25));
        l5.setForeground(Color.decode("#5D3587"));
        add(l5);

        t4 = new JTextField();
        t4.setBounds(320, 375, 300, 40);
        t4.setFont(new Font("Arial", Font.BOLD, 20));
        add(t4);

        b1 = new JButton("Submit");
        b1.setBackground(Color.decode("#FDEBD0"));
        b1.setBounds(200, 455, 290, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 20));
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("Submit")) {
            String name = t1.getText().trim();
            String email = t2.getText().trim();
            String phone = t3.getText().trim();
            String password = t4.getText().trim();
            if(!name.equals("")){
                if(email.endsWith("@gmail.com")){
                    if(phone.length()==10){
                        if(!password.isEmpty()) {
                            JOptionPane.showMessageDialog(this, "Data Submitted Succesfully");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");

                        }else{
                            JOptionPane.showMessageDialog(this,"Please Enter The Password");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Invalid Phone Number");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Invalid Email ID");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Name Field is Empty");
            }
        }
    }

    public static void main(String[] args) {
        registrationForm r = new registrationForm();
    }
}
