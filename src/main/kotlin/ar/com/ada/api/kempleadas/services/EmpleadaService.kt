package ar.com.ada.api.kempleadas.services

import ar.com.ada.api.kempleadas.EmpleadaRepository
import ar.com.ada.api.kempleadas.entities.Categoria
import ar.com.ada.api.kempleadas.entities.Empleada
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Service
class EmpleadaService (

    @Autowired val repo: EmpleadaRepository,
    @Autowired val categoriaService: CategoriaService,

    ){

    @Transactional
    fun crearEmpleada(empleada: Empleada){
        repo.save(empleada)
    }

    fun buscarEmpleada(empleadaId: Int?) = empleadaId?.let { repo.findById(it).orElse(null) }

    //Delete lógico:

    @Transactional
    fun bajaEmpleadaPorId(id: Int?) {
        val empleada = buscarEmpleada(id)
        empleada.setEstado(EstadoEmpleadaEnum.BAJA) // Revisar esto.
        empleada!!.fechaBaja = Date()
        repo.save(empleada)
    }

    fun traerEmpleadaPorCategoria(catId:Int?): List<Empleada>{
       val categoria: Categoria = categoriaService.buscarCategoria(catId),
        return categoria.getEmpleadas()

    }








}