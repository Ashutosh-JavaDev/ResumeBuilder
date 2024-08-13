import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
public class MainPanel extends JFrame {
    
    JPanel firstPanel;
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
}
