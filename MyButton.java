// File: MyButton.java

import javax.swing.*;
import java.awt.*;

// Uppgift 2: Create a button class with two states
public class MyButton extends JButton {

    // Variables to hold state information
    private final String state1Text;
    private final String state2Text;
    private final Color state1Color;
    private final Color state2Color;
    private boolean isState1;

    // Constructor for the button with two states
    public MyButton(String state1Text, String state2Text, Color state1Color, Color state2Color) {
        this.state1Text = state1Text;
        this.state2Text = state2Text;
        this.state1Color = state1Color;
        this.state2Color = state2Color;
        this.isState1 = true;

        // Initialize button with state 1
        setText(state1Text);
        setBackground(state1Color);
    }

    // Uppgift 2: Method to toggle between the two states
    public void toggleState() {
        if (isState1) {
            // Switch to state 2
            setText(state2Text);
            setBackground(state2Color);
        } else {
            // Switch back to state 1
            setText(state1Text);
            setBackground(state1Color);
        }
        isState1 = !isState1;
    }
}
