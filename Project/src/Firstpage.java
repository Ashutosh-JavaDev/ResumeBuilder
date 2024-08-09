import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstpage extends JFrame implements ActionListener {
    JLabel label[]=new JLabel[9];
    //  Firstname,Lastname,link,number,email,about,Education,skills,Experience;
    JTextField field[]=new JTextField[9];
    JPanel panel;
    // Firstfield,Lastfield,linkfield,Numberfield,Aboutfield,Educationfield,Experiencefield;
    JComboBox Skillfield;
    Firstpage() {
        setTitle("Resume Builder");
        setSize(500, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100,400);
        dateEntry();
        setVisible(true);

    }

    private void dateEntry() {
        panel=new JPanel();
        panel.setSize(380,780);
        panel.setBackground(Color.black);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
