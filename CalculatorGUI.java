import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
    private double firstOperand = 0.0;
    private char operator = ' ';
    private boolean start = true;
    
    public CalculatorGUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(new BorderLayout());
        
        textField = new JTextField("0", 16);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        
        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        
        add(panel, BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String buttonLabel = e.getActionCommand();
        if (buttonLabel.equals("C")) {
            textField.setText("0");
            firstOperand = 0.0;
            operator = ' ';
            start = true;
        } else if (buttonLabel.equals("+") || buttonLabel.equals("-") || buttonLabel.equals("*") || buttonLabel.equals("/")) {
            firstOperand = Double.parseDouble(textField.getText());
            operator = buttonLabel.charAt(0);
            start = true;
        } else if (buttonLabel.equals("=")) {
            double secondOperand = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+': textField.setText(String.valueOf(firstOperand + secondOperand)); break;
                case '-': textField.setText(String.valueOf(firstOperand - secondOperand)); break;
                case '*': textField.setText(String.valueOf(firstOperand * secondOperand)); break;
                case '/': textField.setText(String.valueOf(firstOperand / secondOperand)); break;
            }
            firstOperand = 0.0;
            operator = ' ';
            start = true;
        } else {
            if (start) {
                textField.setText(buttonLabel);
                start = false;
            } else {
                textField.setText(textField.getText() + buttonLabel);
            }
        }
    }
    
    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
