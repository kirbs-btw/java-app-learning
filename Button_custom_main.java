import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Button_custom_main{
    public JButton button;
    public Button_custom_main(String name){
        button = new JButton(name);
        // button.setContentAreaFilled(false);
        button.setBorder(new EmptyBorder(16, 25, 16, 25));

    }
}