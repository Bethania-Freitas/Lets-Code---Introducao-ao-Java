public class condicoes {
    public static void main(String[] args) {
        
        int nota = 50;
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if ( nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 50) {
            graduacao = "D";
        } else {
            graduacao = null;
        }

        System.out.println("Nota: " + graduacao);

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado");
                break;
            case "C":
            case "D":   
                System.out.println("Reprovado");    
                break;
            default:
                System.out.println("Nota Invalida");
        }
    }

}
