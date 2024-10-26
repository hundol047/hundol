package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import static java.awt.Color;

public abstract class MiddleTest extends JFrame implements ActionListener, KeyListener {
    private JTextField dispaly;
    private JTextField operator;
    private double firstNumber;

    MiddleTest(this); {

    }

    @Override //프레임 만들기
    public void setTitle(String title) {
        super.setTitle("계산기");
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(300, 400);
    }

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void setLayout(LayoutManager manager) {
        super.setLayout(new BorderLayout());
    }

    display f = new JTextField();
    display.setEditable(false);
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    display.setBackground(Color.WHITE);
    display.setPreferredSize(Dimension(300, 65));
    add(display, BorderLayout.NORTH);


    public static void main(String[] args) {
        middletest f = new middletest();
    }

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4));
    String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+",
    };
    for (String label ; buttonLabels) {
        JButton button = new JButton(label);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        buttonPanel.add(button);
    }
    add(buttonPanel, BorderLayout.Center);

    private void processCommand(String command) {
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            display.setText(display.getText() + command);
        } else if (command.equals("C")) {
            display.setText("");
            firstNumber = 0;
            operator = null;
        } else if (command.equals("=")) {
            double secondNumber = Double.parseDouble(display.getText());
            double result = 0;

        }
    }
}
display.