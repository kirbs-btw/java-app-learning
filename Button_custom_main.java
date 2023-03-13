import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Button_custom_main{
    public JButton button;
    public Button_custom_main(){
        button = new JButton("ello");
        button.setContentAreaFilled(false);
        button.setBorder(new EmptyBorder(8, 8, 8, 8));

    }


}