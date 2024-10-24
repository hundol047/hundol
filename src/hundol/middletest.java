package hundol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class middletest extends JFrame implements ActionListener, KeyListener {
    private JTextField dispaly;
    private JTextField operator;
    private double firstNumber;

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

    display = new JTextField();
    display.setEditable(false);
    display.setHorizontalAlignment(SwingConstants.RIGHT);
    display.setBackground(Color.WHITE);
    display.setPreferredSize(new Dimension(300, 65));
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

}


