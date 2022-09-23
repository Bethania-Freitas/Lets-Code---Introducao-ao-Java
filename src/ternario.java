public class ternario {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean diaDeSol = false;
        boolean vamosAPraia = fimDeSemana && diaDeSol;   

        String mensagem1 = fimDeSemana ? "É fim de semana!" : "Ainda não é fim de semana";
        String mensagem2 = diaDeSol ? "Esta ensolarado" : "Não tem sol...";
        System.out.printf(mensagem1);
        System.out.println(mensagem2);

        if(vamosAPraia == true) {
            System.out.println("Simbora pra Praia!!");
        } else {
            System.out.println("Hoje não vamos a praia");
        }

        

        
    }
    
}
