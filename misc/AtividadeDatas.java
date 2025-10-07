package misc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class AtividadeDatas {

    private LocalDate inicio;
    private LocalDate fim;
    private DayOfWeek dia;

    public AtividadeDatas(CharSequence inicio, CharSequence fim, CharSequence dia) {
        setInicio(inicio);
        setFim(fim);
        setDia(dia);
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(CharSequence inicio) {
        this.inicio = LocalDate.parse(inicio);
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(CharSequence fim) {
        this.fim = LocalDate.parse(fim);
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(CharSequence dia) {
        this.dia = DayOfWeek.valueOf((String) dia);
    }

    //Methods

    public int contadorDia() {

        int dia = 0;
        LocalDate inicio = getInicio();

        while (inicio.isBefore(getFim())) {

            if (inicio.getDayOfWeek().equals(getDia())) {
                dia++;
            }

            inicio = inicio.plusDays(1);
        }

        return dia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Inicio: ").append(inicio).append("\n");
        sb.append("Fim: ").append(fim).append("\n");
        sb.append("dia: ").append(getDia()).append("\n");
        sb.append("Dias: ").append(contadorDia()).append("\n");
        return sb.toString();
    }
}
