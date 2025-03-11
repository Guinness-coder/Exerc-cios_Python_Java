import javax.swing.*;

public class ex8 {
    public static void main(String[]args){
        float M = Float.parseFloat(JOptionPane.showInputDialog("Qual a distância em metros?"));
        float km = M/1000;
        float hm = km*10;
        float dam = hm*10;
        float dm = dam*100;
        float cm = dm*10;
        float mm = cm*10;
        JOptionPane.showMessageDialog(null, "A distância em km: " + km + '\n' +" hm " + hm + '\n' + " dam " + dam + '\n' + " dm " + dm + '\n' + " cm " + cm + '\n' + " mm " + mm + '\n');
    }
}
