import javax.swing.JPanel;
import javax.swing.JFrame;
public class FirstPanel extends JFrame{
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
}
