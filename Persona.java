import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Persona {
    private LocalDate fechaNacimiento;

    public Persona() {

    }

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getEdadDetallada() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        long años = periodo.getYears();
        long meses = periodo.getMonths();
        long días = ChronoUnit.DAYS.between(fechaNacimiento.plusYears(años).plusMonths(meses), fechaActual);

        return "Años: " + años + ", Meses: " + meses + ", Días: " + días;
    }
    @Override
    public String toString() {
        return "Fecha de Nacimiento: " + fechaNacimiento + ", " + getEdadDetallada();
    }
}