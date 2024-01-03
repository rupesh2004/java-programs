import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class number_text_3 extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JButton b1;

    public number_text_3() {
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
            int number = Integer.parseInt(t1.getText());
            String calculatedText = convertToText(number);
            l2.setText(calculatedText);
        }
    }

    public String convertToText(int number) {
        String units[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String teens[] = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen" };
        String tens[] = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        if (number == 0) {
            return "Zero";
        } else if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + units[number % 10];
        } else if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToText(number % 100);
        } else if (number < 10000) {
            return convertToText(number / 1000) + " Thousand " + convertToText(number % 1000);
        }
        return "Number is too large to be converted";

    }

    public static void main(String[] args) {
        number_text_3 text = new number_text_3();
    }
}
