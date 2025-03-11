import javax.swing.*;
public class ex13 {
    public static void main(String[]args){
        float salario=Float.parseFloat(JOptionPane.showInputDialog("Salário atual"));
        double aumento = (salario*0.15);
        JOptionPane.showMessageDialog(null,"O novo salário será: " + (salario+aumento));
    }
}