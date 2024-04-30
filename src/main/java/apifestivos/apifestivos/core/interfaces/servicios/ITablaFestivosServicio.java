package apifestivos.apifestivos.core.interfaces.servicios;

import java.util.Date;
import java.util.List;
public interface ITablaFestivosServicio {

    public List<Date> listar(int anio);

    public String verificarFestivo(int anio, int mes, int dia);
}
