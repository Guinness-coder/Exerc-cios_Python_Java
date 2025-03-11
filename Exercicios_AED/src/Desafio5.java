import javax.swing.JOptionPane;
public class Desafio5 {
    Desafio4 call = new Desafio4();
    static void rdm(){
        int i=4;
        while(i>0) {
            if (Desafio4.match(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite um numero de 0 a 10", "Chute", 1)),11)) {
                JOptionPane.showMessageDialog(null,
                        "Acertou!");
                break;
            }else{
                i--;
                if(i==0){
                    JOptionPane.showMessageDialog(null,
                            "Acabaram suas tentativas!","Aviso",0);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Errou! Ainda restam "+i+" Tentativas!","Aviso",1);
                }
            }
        }
    }
    public static void main(String[] args) {
        rdm();
    }
}
