import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class SecondPanel extends JFrame {
    JPanel thirdPanel;

    public void ThirdPanel() {
        thirdPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(250, 14, 14, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        thirdPanel.setSize(440, 270);
        thirdPanel.setLayout(null);
        thirdPanel.setBounds(5, 280, 440, 265);
        thirdPanel.setOpaque(false);
        firstPanel.add(thirdPanel);
        firstPanel.revalidate();
        firstPanel.repaint();
    }
}
