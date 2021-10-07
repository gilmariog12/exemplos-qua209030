import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {
        
        String d_nasc = JOptionPane.showInputDialog("Em que ano você nasceu: ");
        int d_nasc_ok = Integer.parseInt(d_nasc);
        int ano_atual = 2021;
        int idade = ano_atual-d_nasc_ok;

        String msg = "";

        if(idade >=16){
            msg = "VOCÊ JÁ PODE VOTAR ESTE ANO";
        } else{
            msg = "VOCÊ NÃO PODE VOTAR ESTE ANO";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
