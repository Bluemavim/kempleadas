package ar.com.ada.api.kempleadas.entities.calculos

import java.math.BigDecimal;

import ar.com.ada.api.kempleadas.entities.Empleada;


public class SueldoAdministrativa: ISueldoCalculator {
   override fun calcularSueldo(empleada: Empleada): BigDecimal{
        val sueldoBase: BigDecimal = empleada.getCategoria().getSueldoBase();
        if (empleada.sueldo.compareTo(sueldoBase)) == -1){
            return sueldoBase
        }
        return empleada.sueldo;

    }
}

