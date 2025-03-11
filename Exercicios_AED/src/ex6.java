import javax.swing.*;

public class ex6 {
    public static void main(String[]args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        JOptionPane.showMessageDialog(null,"O sucessor é: "+(num1+1)+"\n"+"E o antecessor é: " +(num1-1));

    }
}
