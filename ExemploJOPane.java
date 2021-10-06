import javax.swing.JOptionPane;

public class ExemploJOPane {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Olá Mundo Java.");

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String temp = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(temp);
//        JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
//        JOptionPane.showMessageDialog(null, "Bem vindo " + idade);
        String msg = "";

        if(idade >=75){
            msg = "você é muito velho";
        } else{
            msg = "você não é tão velho";
        }
        JOptionPane.showMessageDialog(null, " Bem vindo " + nome +", "+ msg+", sua idade é: "+idade);
    }

}
