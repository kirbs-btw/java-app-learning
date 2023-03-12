import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame();
                JPanel panel = new JPanel();

                panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
                frame.add(panel);

                Button_custom_main button = new Button_custom_main();

                panel.add(button.button);
            }
        });
    }
}