import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class Gui {
    public static void main(String[] args) {
        Abc abc = new Abc();
        

    }
}

/**
 * Abc
 */
class Abc extends JFrame { //card Layout
    public Abc() {

        
        JLabel l = new JLabel("Hello World");
        JLabel l1 = new JLabel("Hello Shubham");
        add(l);
        add(l1);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}