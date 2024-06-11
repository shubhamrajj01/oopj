
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class AddNumber {
    public static void main(String[] args) {
        Addition add = new Addition();

    }
}

class Addition extends JFrame {

    JButton b;
    JTextField t1, t2;
    JLabel l;

    Addition(){

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b = new JButton("Add");
        l = new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);

        // // Anonymous Inner Class
        // ActionListener al = new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         int num1 = Integer.parseInt(t1.getText());
        //         int num2 = Integer.parseInt(t2.getText());
        
        //         int value = num1 + num2;
        
        //         l.setText(value + " ");
        //     }
        // };
        // b.addActionListener(al);

        // // Anonymous Inner Class
        // b.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae){
        //         int num1 = Integer.parseInt(t1.getText());
        //         int num2 = Integer.parseInt(t2.getText());
        
        //         int value = num1 + num2;
        
        //         l.setText(value + " ");
        //     }
        // });

        // Lambda Expression
        b.addActionListener( ae ->{
            int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
        
                int value = num1 + num2;
        
                l.setText(value + " ");
        }
        );

        // All these the above three methods are same, but the lambda expression is the most efficient way to write the code.


        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

// Atlernate methoe to create a GUI
// class Addition extends JFrame implements ActionListener{

// JButton b;
// JTextField t1, t2;
// JLabel l;

// Addition(){

// t1 = new JTextField(10);
// t2 = new JTextField(10);
// b = new JButton("Add");
// l = new JLabel("Result");

// add(t1);
// add(t2);
// add(b);
// add(l);

// b.addActionListener(this);

// setSize(400, 400);
// setVisible(true);
// setLayout(new FlowLayout());
// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// }

// public void actionPerformed(ActionEvent ae){
// int num1 = Integer.parseInt(t1.getText());
// int num2 = Integer.parseInt(t2.getText());

// int value = num1 + num2;

// l.setText(value + "");
// }
// }
