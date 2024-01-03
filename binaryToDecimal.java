import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class binaryToDecimal extends JFrame implements ActionListener{
    JLabel l1, l2;
    JTextField t1;
    JButton b1;
    public binaryToDecimal(){
        setVisible(true);
        setSize(800, 600);
        setLayout(null);
        l1 = new JLabel("Enter Number");
        l1.setBounds(100, 100, 200, 100);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(250, 100, 300, 45);
        add(t1);

        b1 = new JButton("Convert");
        b1.setBounds(200, 200, 100, 50);
        add(b1);

        l2 = new JLabel("");
        l2.setBounds(200, 300, 500, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        add(l2);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("Convert")) {
            String number = t1.getText();
            long decimalResult = Long.parseLong(number,2);
            l2.setText(String.valueOf(decimalResult));
        }
    }
    public static void main(String[] args) {
        binaryToDecimal b = new binaryToDecimal();
    }
}
