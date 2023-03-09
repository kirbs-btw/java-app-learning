import javax.swing.JFrame;

public class Frame extends JFrame{
    private JFrame frame;

    public void initialize(){
        this.frame.setTitle("Frame");
        this.frame.setSize(500, 500);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

    public Frame(){
        initialize();
    }
}