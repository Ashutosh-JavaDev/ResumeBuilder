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
    JTextField Firstfield, Lastfield, linkfield, Numberfield, emailfield, Aboutfield, Educationfield, Experiencefield,
            skillfield;

    Firstpage() {
        setTitle("Resume Builder");
        setSize(600, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100, 100);
        LabelPanel();
        labelFunction();
        fieldFunction();
        setVisible(true);
    }

    private void LabelPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color with RGB and alpha (for transparency)
                g.setColor(new Color(0, 204, 204, 50)); // 50 is the alpha value for light opacity
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setSize(590, 790);
        panel.setLayout(new GridLayout(18, 1, 10, 10)); // Adjusted layout for 9 labels and 9 text fields
        panel.setBounds(5, 5, 590, 790);
        panel.setOpaque(false); // Allows the transparency effect
        add(panel);
    }

    private void labelFunction() {
        first = new JLabel("First Name");
        last = new JLabel("Last Name");
        link = new JLabel("Links");
        number = new JLabel("Number");
        skills = new JLabel("Skills");
        email = new JLabel("Email ID");
        about = new JLabel("About");
        Education = new JLabel("Education");
        Experience = new JLabel("Experience");
        JLabel[] labels = { first, last, link, number, email, about, skills, Education, Experience };

        for (int i = 0; i < labels.length; i++) {
            labels[i].setFont(new Font("Segoe UI", Font.BOLD, 18));
            labels[i].setForeground(Color.black);
            labels[i].setFocusable(false);
            panel.add(labels[i]);
        }
    }

    private void fieldFunction() {
        Firstfield = new JTextField();
        Lastfield = new JTextField();
        linkfield = new JTextField();
        Numberfield = new JTextField();
        skillfield = new JTextField();
        emailfield = new JTextField();
        Aboutfield = new JTextField();
        Educationfield = new JTextField();
        Experiencefield = new JTextField();
        JTextField[] fields = { Firstfield, Lastfield, linkfield, Numberfield, skillfield, emailfield, Aboutfield, Educationfield, Experiencefield };

        for (int i = 0; i < fields.length; i++) {
            fields[i].setFont(new Font("Segoe UI", Font.BOLD, 18));
            fields[i].setForeground(Color.black);
            panel.add(fields[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle actions here
    }

    public static void main(String[] args) {
        new Firstpage();
    }
}
