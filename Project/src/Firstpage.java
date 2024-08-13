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
    JPanel firstPanel, secondPanel, thirdPanel,forthPanel;
    JTextField Firstfield, Lastfield, linkfield, Numberfield, emailfield, Aboutfield, Educationfield, Experiencefield,
            skillfield;
    JButton button;

    Firstpage() {
        setTitle("Resume Builder");
        setSize(1000, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 125);
        new MainPanel();
        SecondPanel();
        ThirdPanel();
        Fourthpanel();
        // labelFunction();
        // fieldFunction();
        setVisible(true);
    }

    // new Panel

    public void SecondPanel() {
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250,14,14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        secondPanel.setSize(440, 270);
        secondPanel.setLayout(null);
        secondPanel.setBounds(5, 5, 440,270);
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
        thirdPanel.setSize(440, 270);
        thirdPanel.setLayout(null);
        thirdPanel.setBounds(5,280,440,265);
        thirdPanel.setOpaque(false);
        firstPanel.add(thirdPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
    }
    // 
    public void Fourthpanel() {
        forthPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250,14,14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        forthPanel.setSize(550,570);
        forthPanel.setLayout(null);
        forthPanel.setBounds(450,5,535,540);
        forthPanel.setOpaque(false);
        firstPanel.add(forthPanel);
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
