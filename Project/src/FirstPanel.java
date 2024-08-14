import javax.swing.*;
import java.awt.GridLayout; 
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class FirstPanel extends JFrame {
    JLabel[]label=new JLabel[5];
    JLabel firstName,lastName,Country,city,linkedIN;
    JTextField[]field=new JTextField[5];
    JTextField firstField,lastField,countryField,cityField,linkedField;
    JPanel firstPanel, secondPanel;

    public FirstPanel(MainPanel mainPanel) {
        this.firstPanel = mainPanel.getFirstPanel();
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250, 14, 14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        
        secondPanel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        secondPanel.setSize(440, 270);
        secondPanel.setLayout(null);
        secondPanel.setLayout(new GridLayout(3,2,25,10));
        secondPanel.setBounds(5, 5, 440, 270);
        secondPanel.setOpaque(false);
        firstPanel.add(secondPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
        information();
    }
    public void information(){
        firstName=new JLabel("First Name");
        firstName=new JLabel("First Name");
        firstName=new JLabel("First Name");
        firstName=new JLabel("First Name");
        firstName=new JLabel("First Name");
    }

    public void personalInformation() {

    }
}
