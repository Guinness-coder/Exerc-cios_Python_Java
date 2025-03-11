import javax.swing.*;
public class ex11 {
    public static void main(String[]args){
        float a = Float.parseFloat(JOptionPane.showInputDialog("Valor de A: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Valor de B: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Valor de C: "));
        String delta = String.format("%.2f", (b*b)-(4*a*c));
        JOptionPane.showMessageDialog(null, "Valor de Delta: " + delta);
    }
}
