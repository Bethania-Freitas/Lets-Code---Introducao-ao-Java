
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "Bethânia";
        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt", "BR");
        LocalDateTime agora = LocalDateTime.now();
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        String saudacao;

        System.out.println(agora);

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";            
        } else if (agora.getHour() >= 12 && agora.getHour() < 19) {
            saudacao = "Bom tarde";     
        } else if(agora.getHour() >= 19){
            saudacao = "Bom noite";  
        } else {
            saudacao = "";
        }
        

         System.out.printf("Olá %s!  Seja bem vindo! %n Hoje é %s %n %s", nome, diaSemana,saudacao.toUpperCase());
        

    }
    
}