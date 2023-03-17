import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame();
                JPanel panel = new JPanel();
                panel.setBackground(Color.cyan);
                JPanel centerContainer = new JPanel();

                // panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
                panel.setLayout(new BorderLayout(15, 15));
                frame.add(panel);

                JLabel label = new JLabel("Hello Sir");
                label.setBackground(Color.red);
                panel.add(label, BorderLayout.WEST);

                Button_custom_main button = new Button_custom_main("Press me!");
                panel.add(button.button, BorderLayout.SOUTH);

                centerContainer.setBackground(Color.GREEN);
                panel.add(centerContainer, BorderLayout.CENTER);

                Button_custom_main buttontwo = new Button_custom_main("2!!");
                centerContainer.add(buttontwo.button);

                Button_custom_main buttonthree = new Button_custom_main("3!");
                centerContainer.add(buttonthree.button);

                Button_custom_main buttonfour = new Button_custom_main("4!!");
                centerContainer.add(buttonfour.button);


                JTextField field = new JTextField(25);
                panel.add(field, BorderLayout.NORTH);

                button.button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Button said: " + field.getText());
                    }
                });

            }
        });
    }
}