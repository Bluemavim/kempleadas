package ar.com.ada.api.kempleadas.models.request

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class InfoEmpleadaNueva(

        @field:NotBlank
        val id: String?,

        @field:NotBlank
        val edad: Int?,

        @field:NotNull
        @field:Min(value = 1)
        val sueldo: BigDecimal?,

        @field:NotNull
        @field:Min(value = 0)
        val categoriaId: Int?

)
