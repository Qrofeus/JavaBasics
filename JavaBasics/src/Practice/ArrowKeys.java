package Practice;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {
    public ArrowKeys(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,100);
        frame.setFocusable(true);

        JPanel panel=new JPanel();
        JLabel up=new JLabel();
        up.setText("UP: 0");

        JLabel down=new JLabel();
        down.setText("DOWN: 0");

        JLabel left=new JLabel();
        left.setText("LEFT: 0");

        JLabel right=new JLabel();
        right.setText("RIGHT: 0");

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        frame.add(panel);

        frame.addKeyListener(new KeyListener() {
            int upCount=0, downCount=0, leftCount=0, rightCount=0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode=e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP -> up.setText("UP: " + ++upCount);
                    case KeyEvent.VK_DOWN -> down.setText("DOWN: " + ++downCount);
                    case KeyEvent.VK_LEFT -> left.setText("LEFT: " + ++leftCount);
                    case KeyEvent.VK_RIGHT -> right.setText("RIGHT: " + ++rightCount);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new ArrowKeys();
    }
}
