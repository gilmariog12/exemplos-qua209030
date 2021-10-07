import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        
                String jantar = JOptionPane.showInputDialog("Valor do Jantar: ");
                Double jantar_ok = Double.parseDouble(jantar);


                double taxa = (jantar_ok * 10) / 100;
                double v_total = jantar_ok + taxa;
   
                JOptionPane.showMessageDialog(null, " A taxa do garçom é " + taxa +
                ", o valor com a taxa  é "+ v_total);
            }
}
