package ar.com.ada.api.kempleadas.repos

import org.springframework.data.jpa.repository.JpaRepository
import ar.com.ada.api.kempleadas.entities.Categoria
import org.springframework.stereotype.Repository

@Repository
interface CategoriaRepository : JpaRepository<Categoria, Int>{
    //revisar
   fun findByNombre(categoriaNombre:String): Categoria?

}