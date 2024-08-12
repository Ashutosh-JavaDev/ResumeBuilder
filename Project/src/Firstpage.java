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
    JPanel firstPanel, secondPanel, thirdPanel;
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
        firstPanel.setLayout(null);
        firstPanel.setBounds(5, 5, 990, 590);
        firstPanel.setOpaque(false);
        add(firstPanel);
    }

    public void SecondPanel() {
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250,14,14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        secondPanel.setSize(440, 290);
        secondPanel.setLayout(null);
        secondPanel.setBounds(5, 5, 440,290);
        secondPanel.setOpaque(false);
        firstPanel.add(secondPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
    }
    // 
    public void ThirdPanel() {
        thirdPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250,14,14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        thirdPanel.setSize(440, 290);
        thirdPanel.setLayout(null);
        thirdPanel.setBounds(5, 5, 440,290);
        thirdPanel.setOpaque(false);
        firstPanel.add(thirdPanel);
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
