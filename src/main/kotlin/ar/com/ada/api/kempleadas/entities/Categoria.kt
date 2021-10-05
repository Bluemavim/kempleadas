package ar.com.ada.api.kempleadas.entities

import java.math.BigDecimal
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table



@Entity
@Table(name = "categoria")
data class Categoria(

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "empleada_id")
    //private Integer empleadaId;

        @Id // ¿es necesaria la notación de la columna? ¿ qué pasa con el generationTpye?
        @Column(name = "categoria_id")
        var categoriaId: Integer,

        val nombre: String,

        @Column(name = "sueldo_base")
        val sueldoBase: BigDecimal

        //REVISAR
        //@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        //@JsonIgnore
        //private List<Empleada> empleadas = new ArrayList<>();

        //REVISRA
        //@JsonIgnore //para no devolverlo por el front
        //@Transient //para que no impacte en el hibernate-> luego en la DB
        //private ISueldoCalculator sueldoCalculator;

)
