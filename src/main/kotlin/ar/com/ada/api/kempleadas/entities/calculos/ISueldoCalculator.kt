package ar.com.ada.api.kempleadas.entities.calculos

import java.math.BigDecimal;
import ar.com.ada.api.kempleadas.entities.Empleada;


public interface ISueldoCalculator {
    fun calcularSueldo(empleada: Empleada): BigDecimal
}



