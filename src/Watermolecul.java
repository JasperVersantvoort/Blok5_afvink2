import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Watermolecul  extends JFrame implements ActionListener {
    private JTextField textfield; //declaratie
    private JLabel label;
    private JButton button;
    private JPanel panel; // declaratie van een window om op te watermolecul in tekenen

    public static void main(String[] args) {
        Watermolecul frame = new Watermolecul();
        frame.setSize(500, 500);
        frame.createGui();
        frame.setVisible(true);

    }
    private void createGui(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        label = new JLabel("Voer hier iets in");
        window.add(label);

        textfield = new JTextField("geef hier input"); //initatie
        textfield.setBackground(Color.green);
        window.add(textfield);

        button = new JButton("klik");
        window.add(button);
        window.setBackground(Color.blue);
        button.addActionListener(this); // vergeet niet de inplements

        //plaats pannel (2)
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.white);
        window.add(panel);
        // einde panel


    }

    public void actionPerformed(ActionEvent event){
        //textfield.setText("Hello World");
        //label.setText("Er is geklikt");
        //teken lijn op panel (3)
        Graphics paper = panel.getGraphics(); // haal de referentie aan panel op
        paper.drawLine(10,20, 150,150);

    }
}


