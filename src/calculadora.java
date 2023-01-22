import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JPanel panelPrincipal;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton a0Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton xButton1;
    private JButton xButton;
    private JButton button10;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton cButton;
    private JButton button5;
    private JLabel salida;

    private String Valor, x, y;
    private int num;

    public calculadora(){
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a0Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a0Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a2Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a3Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a4Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a5Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a6Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a7Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a8Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(a9Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"9");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(button3.getText());
                salida.setText(salida.getText()+", ");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(button2.getText());
                salida.setText(salida.getText()+" = ");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(xButton.getText());
                salida.setText(salida.getText()+" x ");
            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(xButton1.getText());
                salida.setText(salida.getText()+" ÷ ");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(xButton1.getText());
                salida.setText(salida.getText()+" + ");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame =new JFrame("calculadora");

        frame.setContentPane(new calculadora().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
