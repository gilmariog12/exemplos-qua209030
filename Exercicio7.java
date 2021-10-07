import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual valor da conta: ");
        Double conta = entrada.nextDouble();

        System.out.println("Quantas pessoas vão pagar: ");
        int pessoas = entrada.nextInt();

        double v_dividido = conta / pessoas;

    //    System.out.println("O valor que cada um tem que pagar é "+v_dividido);
        System.out.printf("O valor que cada um tem que pagar é %.2f ",v_dividido);
        
    }
    
}
