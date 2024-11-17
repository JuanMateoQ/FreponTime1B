package Logic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Horario {
    private LocalDate fecha;
    private LocalTime hora;
    private Duration tiempo;

    @Override
    public String toString() {
        return "Horario{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", tiempo=" + tiempo +
                '}';
    }

    public Horario(LocalDate fecha, LocalTime hora, Duration tiempo) {
        this.fecha = fecha;
        this.hora = hora;
        this.tiempo = tiempo;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null|| getClass() != obj.getClass()){
           return false;
        }
        Horario horario = (Horario)obj;
        return this.fecha.equals(horario.fecha) && this.hora.equals(horario.hora) && this.tiempo.equals(horario.tiempo);
    }
}
