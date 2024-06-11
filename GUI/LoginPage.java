
 //wap to design following loginpage username, password, submit
//wap in java to deisgn following frame with 3 button red, green and blue and when you click on any buuton the background color  the frame should be change
//wap in java frame to design a calculotor shown below input1, input2 , result, add, sub, clear
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class LoginPage extends JFrame implements ActionListener {
        private JTextField usernameField;
        private JPasswordField passwordField;
        private JButton submitButton;
        public LoginPage() {
            setTitle("Login Page");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 150);
            setLayout(new GridLayout(3, 2, 5, 5));

            JLabel usernameLabel = new JLabel("Username:");
            add(usernameLabel);

            usernameField = new JTextField();
            add(usernameField);

            JLabel passwordLabel = new JLabel("Password:");
            add(passwordLabel);

            passwordField = new JPasswordField();
            add(passwordField);

            submitButton = new JButton("Submit");
            submitButton.addActionListener(this);
            add(submitButton);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Here, you can add your logic to verify the username and password
                // For simplicity, let's just print them for now
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);

                // You can add further actions like opening a new window, etc., based on login success
            }
        }

        public static void main(String[] args) {
            new LoginPage();
        }
    }


