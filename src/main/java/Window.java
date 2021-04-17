import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setVisible(true);

        setSize(500,500);
        setLocation (650, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton firstButton = new JButton("Привет!");
        //add (firstButton, BorderLayout.NORTH);
        ActionListener listener = new CloseActionListener();
        firstButton.addActionListener(listener);
        JButton secondButton = new JButton("Пока!");
        ActionListener listener1 = new CloseActionListener();
        secondButton.addActionListener(listener);
        //add(secondButton, BorderLayout.SOUTH);

        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(firstButton);
        panel.add(secondButton);
        add(panel, BorderLayout.SOUTH);
    }

}
