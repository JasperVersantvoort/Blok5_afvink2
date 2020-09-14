import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Watermolecul extends JFrame implements ActionListener {
    private JTextField xtext;
    private JTextField ytext;
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


    }


    public void actionPerformed(ActionEvent event) {
        //teken lijn op panel (3)

        int x = Integer.parseInt(xtext.getText());
        int y = Integer.parseInt(ytext.getText());

        System.out.println(x);
        System.out.println(y);


        Graphics paper = panel.getGraphics(); // haal de referentie aan panel op

        paper.drawLine(60, 25, 110, 50);
        paper.drawLine(60, 70, 110, 55);

        paper.setColor(Color.blue);
        paper.fillOval(50, 20, 20, 20);

        paper.fillOval(50, 60, 20, 20);

        paper.setColor(Color.red);
        paper.fillOval(100, 40, 30, 30);


    }
}


