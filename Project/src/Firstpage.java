import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstpage extends JFrame implements ActionListener {
    JLabel label[]=new JLabel[9];
    //  Firstname,Lastname,link,number,email,about,Education,skills,Experience;
    JTextField Firstfield,Lastfield,linkfield,Numberfield,Aboutfield,Educationfield,Experiencefield;
    JComboBox Skillfield;
    Firstpage() {
        setTitle("Resume Builder");
        setSize(500, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dateEntry();
        setVisible(true);

    }

    private void dateEntry() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
