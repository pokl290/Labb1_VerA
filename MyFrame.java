
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    // Two buttons for Uppgift 3
    private final MyButton button1;
    private final MyButton button2;

    // Constructor to set up the frame
    public MyFrame() {
        // Set the title to the author's name
        setTitle("Author: Kevin Lam");

        // Set favorite background color
        getContentPane().setBackground(Color.BLUE); // Set your favorite color

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout and size of the frame
        setLayout(new FlowLayout());
        setSize(400, 200);

        // Uppgift 2: Create two buttons with different initial states
        button1 = new MyButton("State 1", "State 2", Color.RED, Color.GREEN);
        button2 = new MyButton("State A", "State B", Color.BLUE, Color.ORANGE);

        // Add buttons to the frame
        add(button1);
        add(button2);

        // Uppgift 4: Attach action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // Uppgift 4: ActionListener implementation to handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        // When a button is clicked, toggle its state
        if (e.getSource() == button1) {
            button1.toggleState();
        } else if (e.getSource() == button2) {
            button2.toggleState();
        }
    }

    // Main method to launch the frame
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
