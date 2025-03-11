import javax.swing.*;

public class ex3 {
    public static void main (String[] args) {
        JOptionPane.showMessageDialog(null,"Olá");
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String Salário = JOptionPane.showInputDialog("Qual o seu salário");
        JOptionPane.showMessageDialog(null, "O funcionario "+nome+ " tem um salário de R$"+ Salário);
    }
}
