package ar.com.ada.api.kempleadas.services

import ar.com.ada.api.kempleadas.entities.Categoria
import ar.com.ada.api.kempleadas.repos.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class CategoriaService (

        @Autowired val repo: CategoriaRepository,

        ){

        @Transactional
        fun crearCategoria(categoria:Categoria){
                repo.save(categoria)
        }

        @Transactional
        fun eliminarCategoria(categoriaId: Int?) {
                if (categoriaId != null) {
                        repo.deleteById(categoriaId)
                }
        }

        fun buscarCategoria(categoriaId: Int?) = categoriaId?.let { repo.findById(it).orElse(null) }

        fun buscarCategoriaPorNombre(categoriaNombre: String?) = categoriaNombre?.let { repo.findByNombre(it) }

        fun traerCategorias(): List<Categoria?>? {
                return repo.findAll()
        }

        //Falta incorporar métodos relacionados con Empleadas.

}