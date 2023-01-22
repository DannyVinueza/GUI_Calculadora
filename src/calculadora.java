import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculadora {
    private JPanel panelPrincipal;

    public static void main(String[] args) {
        JFrame frame =new JFrame("calculadora");
        frame.setContentPane(new calculadora().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
