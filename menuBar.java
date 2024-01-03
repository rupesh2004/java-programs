import java.awt.*;
import javax.swing.*;

public class menuBar extends JFrame {
    JMenuBar menu;
    JMenuItem create, open, save, saveAs,aboutUs, contactUs;
    JMenu file,help;

    public menuBar() {
        setVisible(true);
        setSize(400, 400);
        setLayout(new BorderLayout());

        menu = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");

        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");

        aboutUs = new JMenuItem("About Us");
        contactUs = new JMenuItem("Contact Us");

        file.add(open);
        file.add(save);
        file.add(saveAs);

        help.add(aboutUs);
        help.add(contactUs);


        menu.add(file);
        menu.add(help);
        setJMenuBar(menu);
    }

    public static void main(String[] args) {
        menuBar frame1 = new menuBar();
    }

}
