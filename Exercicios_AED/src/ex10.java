import javax.swing.*;
public class ex10 {
    public static void main(String[]args){
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura da parede: "));
        float largura = Float.parseFloat(JOptionPane.showInputDialog("Largura da parede: "));
        JOptionPane.showMessageDialog(null, "A área da parede é: " + altura*largura + " e será necessário: " + (altura*largura)/2 + " litros de tinta");
    }
}

