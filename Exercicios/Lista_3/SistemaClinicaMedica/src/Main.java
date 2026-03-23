import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        Medico med1 = new Medico("Cardiologia", "Gustavo", 1);
        Paciente pac1 = new Paciente(1, 123456789, "Leonardo");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 7, 45);
        Consulta con1 = new Consulta(data, 500, med1, pac1);

        System.out.println("Consulta realizada:" + con1);
    }
}
