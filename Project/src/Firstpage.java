import javax.swing.*;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstpage extends JFrame implements ActionListener {
    JLabel label[] = new JLabel[9];
    JLabel first, last, link, number, email, about, Education, skills, Experience;
    JTextField field[] = new JTextField[9];
    JPanel panel;
    // Firstfield,Lastfield,linkfield,Numberfield,Aboutfield,Educationfield,Experiencefield,skillfield;

    Firstpage() {
        setTitle("Resume Builder");
        setSize(600, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100, 100);
        Panel();
        PanelFunction();
        setVisible(true);

    }

    private void Panel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color with RGB and alpha (for transparency)
                g.setColor(new Color(0, 0, 0, 80)); // 50 is the alpha value for light opacity
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setSize(590, 790);
        panel.setLayout(new GridLayout(4, 2, 50, 25));
        panel.setBounds(5, 5, 590, 790);
        panel.setOpaque(false); // Allows the transparency effect
        add(panel);
    }

    private void PanelFunction() {
        first = new JLabel("First Name");
        last = new JLabel("Last Name");
        link = new JLabel("Links");
        number = new JLabel("Number");
        skills = new JLabel("Skills");
        email = new JLabel("Email ID");
        about = new JLabel("About");
        Education = new JLabel("Education");
        Experience = new JLabel("Experience");
        JLabel[] labels = {first, last, link, number, email, about, skills, Education, Experience};

        for (int i = 0; i < labels.length; i++) {
            labels[i].setFont(new Font("Segoe UI",Font.BOLD,18));
            labels[i].setForeground(Color.white);
            labels[i].setFocusable(false);
            panel.add(Box.createRigidArea(new Dimension(0, 10)));
            panel.add(labels[i]);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
