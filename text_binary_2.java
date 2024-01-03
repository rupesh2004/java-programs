import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class text_binary_2 extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JButton b1;

    public text_binary_2() {
        setVisible(true);
        setSize(800, 600);
        setLayout(null);

        l1 = new JLabel("Enter Text");
        l1.setBounds(100, 100, 100, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);

        t1 = new JTextField();
        t1.setBounds(250, 100, 300, 45);
        add(t1);

        b1 = new JButton("Submit");
        b1.setBounds(200, 200, 100, 50);
        add(b1);

        l2 = new JLabel("");
        l2.setBounds(200, 300, 300, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        add(l2);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent av) {
        String s = av.getActionCommand();
        if(s.equals("Submit")){
            String text = t1.getText();

            StringBuilder sb = new StringBuilder();
            for(char c : text.toCharArray()){
                sb.append(Integer.toBinaryString(c)).append(" ");
            }
            l2.setText(sb.toString().trim());
        }
    }

    public static void main(String[] args) {
        text_binary_2 text = new text_binary_2();
    }
}
