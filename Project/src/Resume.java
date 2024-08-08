import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resume extends JFrame implements ActionListener {
    Resume() {
        setTitle("Resume Builder");
        setSize(500, 800);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dateEntry();
        setVisible(true);

    }

    private void dateEntry() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
