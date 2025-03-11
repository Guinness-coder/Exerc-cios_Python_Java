import javax.swing.*;

public class ex4 {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite um numero");
        String num2 = JOptionPane.showInputDialog("Digite um numero");
        int soma1 = Integer.parseInt(num1);
        int soma2 = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, "a soma é:" +(soma1+soma2));
    }
}
