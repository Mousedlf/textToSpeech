package style;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {

    private static final Color BASE_COLOR = new Color(64, 64, 64);
    private static final Color HOVER_COLOR = Color.BLACK;

    public CustomButton(String text) {
        super(text);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setBackground(BASE_COLOR);
        setFont(StyleConstants.P);

        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(HOVER_COLOR);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(BASE_COLOR);
            }
        });
    }
}
