// Naam: Jasper Versantvoort
// Blok 5 afvink 2
// Teken watermolecul

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Watermolecul extends JFrame implements ActionListener {
    private JTextField xtext;
    private JTextField ytext;
    private JLabel uitleg;
    private JLabel xlabel;
    private JLabel ylabel;
    private JButton button;
    private JPanel panel; // declaratie van een window om op te watermolecul in tekenen

    public static void main(String[] args) {
        Watermolecul frame = new Watermolecul();
        frame.setSize(500, 500);
        frame.createGui();
        frame.setVisible(true);

    }

    private void createGui() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        xlabel = new JLabel("X: ");
        window.add(xlabel);

        xtext = new JTextField(3);
        window.add(xtext);

        ylabel = new JLabel("Y: ");
        window.add(ylabel);

        ytext = new JTextField(3);
        window.add(ytext);


        button = new JButton("klik");
        window.add(button);
        button.addActionListener(this); // vergeet niet de inplements

        //plaats pannel (2)
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.white);
        window.add(panel);
        // einde panel

        uitleg = new JLabel("Geef een X en Y punt als cijfers. X tussen 50 en 200 en Y tussen 0 en 200");
        window.add(uitleg);


    }


    public void actionPerformed(ActionEvent event) {
        // actie die wordt uitgvoerd wnr buton wordt ingeklikt


        int x = Integer.parseInt(xtext.getText());
        int y = Integer.parseInt(ytext.getText());

        if (x > 50 & x < 200 & y > 0 & y < 200) {
            System.out.println(x);
            System.out.println(y);

            Graphics paper = panel.getGraphics(); // haal de referentie aan panel op


            paper.clearRect(0, 0, 200, 200);


            paper.drawLine(x - 40, y + 30, x + 10, y + 10);
            paper.drawLine(x - 40, y - 10, x + 10, y + 10);

            paper.setColor(Color.blue);
            paper.fillOval(x - 50, (y + 20), 20, 20);

            paper.fillOval(x - 50, y - 20, 20, 20);

            paper.setColor(Color.red);
            paper.fillOval(x, y, 30, 30);
        } else {
            System.out.println("buiten range");
        }


    }
}


