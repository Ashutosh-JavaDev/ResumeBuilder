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
    JPanel firstPanel, secondPanel, panelnew;
    JTextField Firstfield, Lastfield, linkfield, Numberfield, emailfield, Aboutfield, Educationfield, Experiencefield,
            skillfield;
    JButton button;

    Firstpage() {
        setTitle("Resume Builder");
        setSize(1000, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 125);
        newPanel();
        SecondPanel();
        // FieldPanel();
        // ButtonFunction();
        // labelFunction();
        // fieldFunction();
        setVisible(true);
    }

    // new Panel
    public void newPanel() {
        firstPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(0, 204, 204, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        firstPanel.setSize(990, 590);
        firstPanel.setLayout(new GridLayout(1, 2, 10, 10));
        firstPanel.setBounds(5, 5, 990, 590);
        firstPanel.setOpaque(false);
        add(firstPanel);
    }

    public void SecondPanel() {
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        secondPanel.setSize(440, 290);
        secondPanel.setLayout(new GridLayout(2, 1, 10, 10));
        secondPanel.setBounds(5, 5, 440, 590);
        secondPanel.setOpaque(false);
        firstPanel.add(secondPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle actions here
        if (ae.getSource() == button) {

        }
    }

    public static void main(String[] args) {
        new Firstpage();
    }
}
