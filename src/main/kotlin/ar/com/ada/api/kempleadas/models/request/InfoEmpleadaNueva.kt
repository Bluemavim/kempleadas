package ar.com.ada.api.kempleadas

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class InfoEmpleadaNueva(

        @field:NotBlank
        val id: String?,

        @field:NotBlank
        val edad: Integer?,

        @field:NotNull
        @field:Min(value = 1)
        val sueldo: BigDecimal?,

        @field:NotNull
        @field:Min(value = 0)
        val categoriaId: Integer?

)
