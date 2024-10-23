package hundol;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class middletest extends JFrame implements ActionListener, KeyListener {
    private JTextField dispaly;
    private JTextField operator;
    private double firstNumber;

    @Override
    public void setTitle(String title) {
        super.setTitle("계산기");
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(300, 400);
    }
}


