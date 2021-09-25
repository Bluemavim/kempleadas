package ar.com.ada.api.kempleadas

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "empleada")
data class Empleada(

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "empleada_id")
    //private Integer empleadaId;

        @Id // ¿es necesaria la notación de la columna? ¿ qué pasa con el generationTpye?
        @Column(name = "empleada_id")
        var empleadaId: Integer,

        // Revisar:
        //ManyToOne //join columns van donde esta FK
        //@JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
        //private Categoria categoria;
                
        val sueldo: BigDecimal 

        @Column(name = "fecha_alta")
        var fechaAlta: Date,

        @Column(name = "fecha_baja")
        var fechaBaja: Date,

        val nombre: String
        val edad:Integer

)


//¿Qué pasa con los getters y setters? VER