import javax.swing.*;
public class ex12 {
    public static void main(String[]args){
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Preço do produto: "));
        double desconto = (preco*0.05);
        JOptionPane.showMessageDialog(null, "O preço final será:" + (preco-desconto));
    }
}
