import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;

public class FirstPanel extends JFrame {
    String[] labelNames = { "First Name", "Last Name", "Country", "City", "Linked IN" };
    JLabel[] label = new JLabel[5];
    JTextField[] field = new JTextField[5];
    JTextField firstField, lastField, countryField, cityField, linkedField;
    Font font = new Font("Raleway", Font.BOLD, 16);
    JPanel firstPanel, secondPanel;

    public FirstPanel(MainPanel mainPanel) {
        this.firstPanel = mainPanel.getFirstPanel();
        secondPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(128, 128, 128, 75));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        secondPanel.setBorder(BorderFactory.createTitledBorder("Personal Information"));
        secondPanel.setSize(440, 270);
        secondPanel.setLayout(null);
        secondPanel.setLayout(new GridBagLayout());
        secondPanel.setBounds(5, 5, 440, 270);
        secondPanel.setOpaque(false);
        firstPanel.add(secondPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
        information();
    }

    public void information() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 10); // Add some spacing
        gbc.fill = GridBagConstraints.VERTICAL; // Make components fill horizontally

        for (int i = 0; i < labelNames.length; i++) {
            label[i] = new JLabel(labelNames[i]);
            label[i].setFont(font);
            
            // Calculate grid positions
            gbc.gridx = i % 2; // Column (0 or 1)
            gbc.gridy = (i / 2) * 2; // Row (0, 2, or 4 for labels)
            secondPanel.add(label[i], gbc);

            field[i] = new JTextField(15); // Create the text field
            gbc.gridy = (i / 2) * 2 + 1; // Row (1, 3, or 5 for text fields)
            secondPanel.add(field[i], gbc);
        }
    }

}
