import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstpage extends JFrame implements ActionListener {
    JLabel label[] = new JLabel[9];
    JLabel first, last, link, number, email, about, Education, skills, Experience;
    JTextField field[] = new JTextField[9];
    JPanel firstPanel, secondPanel, thirdPanel, forthPanel;
    JTextField Firstfield, Lastfield, linkfield, Numberfield, emailfield, Aboutfield, Educationfield, Experiencefield,
            skillfield;
    JButton button;

    Firstpage() {
        setTitle("Resume Builder");
        setSize(1000, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 125);

        MainPanel mainPanel = new MainPanel();
        new MainPanel();
        new FirstPanel(mainPanel);
        new SecondPanel(mainPanel);
        new ThirdPanel(mainPanel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle actions here
        if (ae.getSource() == button) {

        }
    }

    // public static void main(String[] args) {

    //     new Firstpage();

    // }
}
