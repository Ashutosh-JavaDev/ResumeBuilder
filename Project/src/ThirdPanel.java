import javax.swing.JPanel;

public class ThirdPanel {
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
}
