package ar.com.ada.api.kempleadas.entities.calculos

import java.math.BigDecimal;
import ar.com.ada.api.kempleadas.entities.Empleada;

class SueldoAuxiliar: ISueldoCalculator {
    override fun calcularSueldo(empleada: Empleada): BigDecimal{
        return empleada.getCategoria().getSueldoBase();
}
}
