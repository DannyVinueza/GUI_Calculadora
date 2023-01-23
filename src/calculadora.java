import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

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
    private JLabel salidaResultado;
    private JButton button4;

    private String valor, x, y;
    private int num;
    private int calcular;//Variable que guardara que operacion va  a hacer la calculadora
    static DecimalFormat dc = new DecimalFormat("##.00");

    public calculadora(){
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 valor = salida.getText();
                //num = Integer.parseInt(a0Button.getText());
                /*salida.setText("");
                salida.setText(salida.getText()+"0");*/
                if (valor.length()==1 && valor.equals("0")){
                    salida.setText("0");
                }else{
                    salida.setText(valor + "0");
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = salida.getText();
                /*num = Integer.parseInt(a0Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"1");*/
                if (valor.equals("0")){
                    salida.setText("1");
                }else{
                    salida.setText(valor + "1");
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = salida.getText();
                /*num = Integer.parseInt(a2Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"2");*/
                if(valor.equals("0")){
                    salida.setText("2");
                }else{
                    salida.setText(valor + "2");
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a3Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"3");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("3");
                }else{
                    salida.setText(valor + "3");
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a4Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"4");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("4");
                }else{
                    salida.setText(valor + "4");
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a5Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"5");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("5");
                }else{
                    salida.setText(valor + "5");
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* num = Integer.parseInt(a6Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"6");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("6");
                }else{
                    salida.setText(valor + "6");
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a7Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"7");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("7");
                }else{
                    salida.setText(valor + "7");
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a8Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"8");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("8");
                }else{
                    salida.setText(valor + "8");
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(a9Button.getText());
                salida.setText("");
                salida.setText(salida.getText()+"9");*/
                valor = salida.getText();
                if(valor.equals("0")){
                    salida.setText("9");
                }else{
                    salida.setText(valor + "9");
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* num = Integer.parseInt(button3.getText());
                salida.setText(salida.getText()+", ");*/
                valor = salida.getText();
                if (!valor.contains(".")){
                    salida.setText(valor + ".");
                }
            }
        });
        button2.addActionListener(new ActionListener() {//Boton igual
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(button2.getText());
                salida.setText(salida.getText()+" = ");*/
                /*y = salida.getText();
                if(calcular == 1){
                    float num1 = Float.parseFloat(x);
                    float num2 = Float.parseFloat(y);
                    float resultado = (num1 + num2);
                    salidaResultado.setText(String.valueOf(resultado));
                }*/

                valor = salida.getText();
                char operador = '+';
                double resultadoTotal = 0;
                for(int i = 0; i < valor.length(); i++){
                    char c = valor.charAt(i);
                    if (Character.isDigit(c)){
                        double numGeneral = Character.getNumericValue(c);
                        if(operador == '+'){
                            resultadoTotal = resultadoTotal + numGeneral;
                        }else if(operador == '-'){
                            resultadoTotal = resultadoTotal - numGeneral;
                        }else if(operador == '*'){
                            resultadoTotal = resultadoTotal * numGeneral;
                        }else if(operador == '/'){
                            resultadoTotal = resultadoTotal / numGeneral;
                        }
                    }else if(c == '+' || c == '-' || c == '*' || c == '/'){
                        operador = c;
                    }
                }
                salidaResultado.setText(String.valueOf(resultadoTotal));
            }
        });
        xButton.addActionListener(new ActionListener() {//Boton de multiplicacion
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(xButton.getText());
                salida.setText(salida.getText()+" x ");*/
                x = salida.getText();
                salida.setText(x + "*");
                calcular = 2;
            }
        });
        xButton1.addActionListener(new ActionListener() {//Boton division
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(xButton1.getText());
                salida.setText(salida.getText()+" ÷ ");*/
                x = salida.getText();
                salida.setText(x + "/");
                calcular = 4;
            }
        });
        button10.addActionListener(new ActionListener() {//Boton suma
            @Override
            public void actionPerformed(ActionEvent e) {
                /*num = Integer.parseInt(xButton1.getText());
                salida.setText(salida.getText()+" + ");*/
                x = salida.getText();
                salida.setText(x + "+");
                calcular = 1;

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = salida.getText();
                int longitud = valor.length();
                int tamanio = longitud;
                if(valor.contains("-")){
                    salida.setText(valor.substring(1,tamanio));
                }else{
                    salida.setText("-"+valor);
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor = salida.getText();
                int longitud = valor.length();
                int tamanio = longitud - 1;
                if (tamanio >= 1){
                    salida.setText(valor.substring(0,tamanio));
                }else{
                    salida.setText("0");
                }
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//Boton borrar
                valor = salida.getText();
                if(!valor.equals("0")){
                    salida.setText("0");
                    salidaResultado.setText("Resultado saldrá aqui");
                }else{
                    salida.setText("0");
                    salidaResultado.setText("Resultado saldrá aqui");
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame =new JFrame("calculadora");

        frame.setContentPane(new calculadora().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370,300);
        frame.pack();
        frame.setVisible(true);
    }
}
