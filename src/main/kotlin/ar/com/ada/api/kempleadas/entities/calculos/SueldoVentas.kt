package ar.com.ada.api.kempleadas.entities.calculos

import ar.com.ada.api.kempleadas.entities.Empleada
import java.math.BigDecimal


class SueldoVentas: ISueldoCalculator {
    override fun calcularSueldo(empleada: Empleada): BigDecimal? {
        val ventasAnuales: BigDecimal = empleada.obtenerVentasAnuales()
        return empleada.empleada.getCategoria().getSueldoBase().add(ventasAnuales.multiply(BigDecimal(0.1))).setScale(
            2,
            RoundingMode.HALF_EVEN)
    }
}

