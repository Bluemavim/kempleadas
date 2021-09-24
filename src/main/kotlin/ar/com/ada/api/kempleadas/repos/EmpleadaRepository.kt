package ar.com.ada.api.kempleadas

import org.springframework.data.jpa.repository.JpaRepository
import ar.com.ada.api.kempleadas.entities.Empleada

interface EmpleadaRepository : JpaRepository<Empleada, Integer>{

}