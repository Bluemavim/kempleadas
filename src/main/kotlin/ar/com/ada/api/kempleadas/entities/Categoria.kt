package ar.com.ada.api.kempleadas.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore;
import ar.com.ada.api.kempleadas.entities.calculos.ISueldoCalculator;
import kotlin.collections.ArrayList


@Entity
@Table(name = "categoria")
data class Categoria(

        //var <propertyName>[: <PropertyType>] [= <property_initializer>]
        //[<getter>]
        //[<setter>]

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "categoria_id")
        var categoriaId: Int,

        val nombre: String?,

        @Column(name = "sueldo_base", nullable = false)
        val sueldoBase: BigDecimal,

        @OneToMany(mappedBy = "categoria", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER)
        @JsonIgnore
        var empleadas: List<Empleada> = ArrayList<Empleada>(),

        @JsonIgnore
        @Transient
        var sueldoCalculator: ISueldoCalculator,

        )
