import style.CustomButton;
import style.StyleConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Synthèse vocale");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JTextField textField = new JTextField("", 30);
        textField.setPreferredSize(new Dimension(300, 60));
        textField.setFont(StyleConstants.P);
        textField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

        CustomButton readButton = new CustomButton("Lire");

        // Écouteur d'événements pour le bouton
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                System.out.println(text);
                // Ici, vous pouvez ajouter votre logique pour la synthèse vocale
            }
        });

        // Ajout des composants au panneau avec des contraintes
        gbc.insets = new Insets(10, 10, 10, 10); // Marge autour des composants
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainFrame.add(textField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainFrame.add(readButton, gbc);

        // Affichage de la fenêtre
        mainFrame.setVisible(true);
    }
}
