package ar.com.ada.api.kempleadas

import org.springframework.data.jpa.repository.JpaRepository
import ar.com.ada.api.kempleadas.entities.Categoria

interface CategoriaRepository : JpaRepository<Categoria, Integer>{
    //revisar
    findByNombre: Categoria (categoriaNombre:String)

}