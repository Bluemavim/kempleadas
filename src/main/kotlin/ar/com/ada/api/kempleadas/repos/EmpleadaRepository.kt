package ar.com.ada.api.kempleadas

import org.springframework.data.jpa.repository.JpaRepository
import ar.com.ada.api.kempleadas.entities.Empleada
import org.springframework.stereotype.Repository

@Repository
interface EmpleadaRepository : JpaRepository<Empleada, Int>{

}