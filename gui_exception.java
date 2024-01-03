import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class custom extends Exception{
    public custom(String str){
        super(str);
    }
}
class gui_exception extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JButton b1;
    public gui_exception(){
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

        b1 = new JButton("Verify");
        b1.setBounds(200, 200, 100, 50);
        add(b1);

        l2 = new JLabel("");
        l2.setBounds(200, 300, 500, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        add(l2);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String s = ae.getActionCommand();
        if(s.equals("Verify")) {
            int age = Integer.parseInt(t1.getText());
            try {
                if(age > 68){
                l2.setText("valid age");
                }else{
                    throw new custom("invald age");
                }
            } catch (custom c) {
                l2.setText(c.getMessage());
            }
            
        }
    }
    public static void main(String[] args) {
        gui_exception g = new gui_exception();
    }
}
