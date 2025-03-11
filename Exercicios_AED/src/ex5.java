import javax.swing.*;
import java.net.InterfaceAddress;

public class ex5 {
    public static void main (String[] args){
    String num1 = JOptionPane.showInputDialog("Qual o primeiro numero para calcular a media?");
    String num2 = JOptionPane.showInputDialog("Qual o segundo numero para calucular a media?");
    float med1 = Float.parseFloat(num1);
    float med2 = Float.parseFloat(num2);
    float media = (med1 + med2)/2;
    JOptionPane.showMessageDialog(null, "A media será: " + media);
    }
}
