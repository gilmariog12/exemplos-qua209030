import javax.swing.JOptionPane;

public class Exercicio_laco_3 {
    public static void main(String[] args) {
        //Escreva um código que pergunte um número ao usuário, e mostre sua tabuada (de 1 até 10)

        String temp = JOptionPane.showInputDialog("Digite numero: ");
        int num = Integer.parseInt(temp);
        String msg = "";
      
        for (int mult = 0; mult <= 10; mult++) {
            int res = num * mult;
            System.out.println(num + " x " + mult + " = " + res);
//            JOptionPane.showMessageDialog(null, num + " x " + i + " = " + res);
          }
          
    }
}
