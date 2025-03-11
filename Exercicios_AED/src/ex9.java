import javax.swing.*;


public class ex9 {
    public static void main(String[]args){
        float carteira = Float.parseFloat(JOptionPane.showInputDialog("Quanto você quer converter?"));
        String dollar = String.format(" %.2f ",carteira/3.45 );

        JOptionPane.showMessageDialog(null, "A quantidade de real em dólar vai ser: " + dollar);


    }
}
