import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberOperationsApp extends JFrame implements ActionListener {
    private JTextField numberInputField;
    private JTextField resultField;
    private JButton factorialButton;
    private JButton squareButton;
    
    public NumberOperationsApp() {
        setTitle("Number Operations");
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        // Number input field
        JLabel numberInputLabel = new JLabel("Enter a number:");
        numberInputField = new JTextField(10);
        
        // Result field
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(15);
        resultField.setEditable(false);
        
        // Buttons
        factorialButton = new JButton("FACTORIAL");
        factorialButton.addActionListener(this);
        
        squareButton = new JButton("SQUARE");
        squareButton.addActionListener(this);
        
        // Add components to the frame
        add(numberInputLabel);
        add(numberInputField);
        add(factorialButton);
        add(squareButton);
        add(resultLabel);
        add(resultField);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == factorialButton) {
            calculateFactorial();
        } else if (e.getSource() == squareButton) {
            calculateSquare();
        }
    }
    
    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(numberInputField.getText());
            long factorial = calculateFactorialRecursive(number);
            resultField.setText(String.valueOf(factorial));
        }
        catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
    
    private long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }
    
    private void calculateSquare() {
        try {
            int number = Integer.parseInt(numberInputField.getText());
            int square = number * number;
            resultField.setText(String.valueOf(square));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }
    
    public static void main(String[] args) {
        new NumberOperationsApp();
    }
}
