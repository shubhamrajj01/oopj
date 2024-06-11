
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;

class calutate {
    public static void main(String[] args) {
        AddSub addSub = new AddSub();
    
    }
}

class AddSub extends JFrame implements ActionListener{
    JButton b1, b2;
    JTextField t1, t2;
    JLabel l;

    AddSub(){
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);



        b1.addActionListener(this);
        b2.addActionListener(this);

        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        int value =0;

        if(ae.getSource() == b1){
            value = num1 +num2;
        }
        else{
            value = num1 - num2;
        }

        l.setText(value + "");
    }

}


// class AddSub extends JFrame{
//     JButton b1, b2;
//     JTextField t1, t2;
//     JLabel l;

//     AddSub(){
//         b1 = new JButton("Add");
//         b2 = new JButton("Subtract");
//         t1 = new JTextField(10);
//         t2 = new JTextField(10);
//         l = new JLabel("Result");

//         add(t1);
//         add(t2);
//         add(b1);
//         add(b2);
//         add(l);



//         b1.addActionListener(ae ->
//         {
//             int num1 = Integer.parseInt(t1.getText());
//             int num2 = Integer.parseInt(t2.getText());
//             int value = num1 + num2;
//             l.setText(value + " ");
//         });
//         b2.addActionListener(ae->
//         {
//             int num1 = Integer.parseInt(t1.getText());
//             int num2 = Integer.parseInt(t2.getText());
//             int value = num1 - num2;
//             l.setText(value + " ");
        
//         });


//         setLayout(new FlowLayout());
//         setVisible(true);
//         setSize(400, 400);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//     }

// }