package ar.com.ada.api.kempleadas.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import java.sql.Date


@Entity
@Table(name = "empleada")
data class Empleada(

        //El signo de pregunta al final del tipo de variable tiene que ver con el concepto de Null Safety en Kotlin
        // Ver: https://kotlinlang.org/docs/null-safety.html

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "empleada_id")
        var empleadaId: Int?,

        @ManyToOne
        @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
        var categoria: Categoria?,

        var sueldo: BigDecimal?,

        @Column(name = "fecha_alta", nullable = false)
        var fechaAlta: Date?,

        @Column(name = "fecha_baja")
        var fechaBaja: Date,

        var nombre: String?,

        var edad:Int?

)

        // ¿Es necesario utilizar el mecanismo de Null Safety cuando se utiliza: nullable = false?
