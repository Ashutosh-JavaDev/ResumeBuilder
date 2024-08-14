import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class FirstPanel extends JFrame {
    String[] labelNames = { "First Name", "Last Name", "Country", "City", "Linked IN" };
    JLabel[] label = new JLabel[5];
    JTextField[] field = new JTextField[5];
    JTextField firstField, lastField, countryField, cityField, linkedField;
    Font font=new Font("Raleway",Font.BOLD,16);
    JPanel firstPanel, secondPanel;

    public FirstPanel(MainPanel mainPanel) {
        this.firstPanel = mainPanel.getFirstPanel();
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(128,128,128,75));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        secondPanel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        secondPanel.setSize(440, 270);
        secondPanel.setLayout(null);
        secondPanel.setLayout(new GridLayout(3, 2,10,2));
        secondPanel.setBounds(5, 5, 440, 270);
        secondPanel.setOpaque(false);
        firstPanel.add(secondPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
        information();
    }

    public void information() {
        for (int i = 0; i < labelNames.length; i++) {
            label[i] = new JLabel(labelNames[i]);
            label[i].setFont(font);
            secondPanel.add(label[i]);
            
        }
    }
}
