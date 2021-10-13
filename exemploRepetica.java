public class exemploRepetica {
    public static void main(String[] args) {
        /*
        //meta, escrever algoritmo que vai mostrar os números de 1 até 50
        int n = 1;
        while (n <= 50){
            //n++ - > n = n + 1
            System.out.println(n++); 
        }*/

        //meta, escrever a palavra SENAI 20x
/*        int n = 1;
        while (n <= 20){
            System.out.println("SENAI");
            n++;
        
        }*/
        int n = 1;

         //1,2,3, pim,
         //5,6,7, pim,
         //9,10,11, pim
        n = 1;
        while (n <= 50){
            // 4 % 4 (resto = 0)
            if((n % 4) != 0){
                System.out.println(n);
            } else {
                System.out.println("pim");
            }
            n++;
        }

    }
}
