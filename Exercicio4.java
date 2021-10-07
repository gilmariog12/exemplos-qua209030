import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {

        
                String num1 = JOptionPane.showInputDialog("Digite um número: ");
                String num2 = JOptionPane.showInputDialog("Digite outro numero: ");

                Double num1_ok = Double.parseDouble(num1);
                Double num2_ok = Double.parseDouble(num2);


                double dividir = num1_ok / num2_ok;
                double somar = num1_ok + num2_ok;
                double subtrair = num1_ok - num2_ok;
                double multiplicar = num1_ok * num2_ok;

                String msg = "";
        

                JOptionPane.showMessageDialog(null, " A soma dos dois numeros é " + somar +
                ", A subtração dos dois numeros é "+ subtrair+ ", A multiplicação dos dois numeros é: "+multiplicar +
                ", A divisão dos dois numeros é: "+dividir);
            }
        
}
