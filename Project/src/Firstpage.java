import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstpage extends JFrame implements ActionListener {
    JLabel label[] = new JLabel[9];
    JLabel first, last, link, number, email, about, Education, skills, Experience;
    JTextField field[] = new JTextField[9];
    JPanel panel,panel2,panelnew;
    JTextField Firstfield, Lastfield, linkfield, Numberfield, emailfield, Aboutfield, Educationfield, Experiencefield,
            skillfield;
            JButton button;


    Firstpage() {
        setTitle("Resume Builder");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 125);
        newPanel();
        LabelPanel();
        FieldPanel();
        ButtonFunction();
        labelFunction();
        fieldFunction();
        setVisible(true);
    }
    // new Panel
    private void newPanel() {
        panelnew = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color with RGB and alpha (for transparency)
                g.setColor(new Color(0, 204, 204, 50)); // 50 is the alpha value for light opacity
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelnew.setSize(590, 590);
        panelnew.setLayout(new GridLayout(1,2,10,10)); // Adjusted layout for 9 labels and 9 text fields
        panelnew.setBounds(5, 5, 590, 590);
        panelnew.setOpaque(false); // Allows the transparency effect
        add(panelnew);
    }

    // labelPanel
    private void LabelPanel() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color with RGB and alpha (for transparency)
                g.setColor(new Color(255, 255, 255, 50)); // 50 is the alpha value for light opacity
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel.setSize(200, 590);
        panel.setLayout(new GridLayout(9, 1, 10, 10)); // Adjusted layout for 9 labels and 9 text fields
        panel.setBounds(5, 5, 200, 590);
        panel.setOpaque(false); // Allows the transparency effect
        panelnew.add(panel,BorderLayout .CENTER);
    }
    // TexTPanel
    private void FieldPanel() {
        panel2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the color with RGB and alpha (for transparency)
                g.setColor(new Color(255, 255, 255, 0)); // 50 is the alpha value for light opacity
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panel2.setSize(220, 590);
        panel2.setLayout(new GridLayout(9, 1, 5, 10)); // Adjusted layout for 9 labels and 9 text fields
        panel2.setBounds(215,5,200, 590);
        panel2.setOpaque(false); // Allows the transparency effect
        panelnew.add(panel2,BorderLayout.CENTER);
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
            panel2.add(fields[i]);
        }
    }
    public void ButtonFunction(){
        button=new JButton("Next");
        button.setSize(15,20);
        button.setBounds(200,550,100,30);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle actions here
    }

    public static void main(String[] args) {
        new Firstpage();
    }
}
