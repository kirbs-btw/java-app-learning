import javax.swing.JFrame;

public class Frame{
    private JFrame frame;

    public void initialize(){
        frame = new JFrame();
        this.frame.setTitle("Frame");
        this.frame.setSize(500, 500);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

    public Frame(){
        initialize();
    }
}