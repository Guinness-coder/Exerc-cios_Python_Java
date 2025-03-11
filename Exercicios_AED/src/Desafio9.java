import javax.swing.JOptionPane;
public class Desafio9 {
    public  static String sequence(int a ){
        Desafio7 call = new Desafio7();
        String awnser = "";
        for (int i = 0; i <= a; i++) {
            awnser+=" >> "+call.fibonacci(i);
        }
        return awnser+=" FIM";
    }
    public static void main(String[] args) {
        int r = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade da sequência:"));
        JOptionPane.showMessageDialog(null,
                sequence(r),"Fibonacci",1);
    }
}
