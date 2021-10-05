package ar.com.ada.api.kempleadas.controllers
import org.springframework.web.bind.annotation.*
import ar.com.ada.api.kempleadas.models.response.GenericResponse
import ar.com.ada.api.kempleadas.models.request.InfoEmpleadaNueva
import ar.com.ada.api.kempleadas.services.CategoriaService

@RestController
class CategoriaController(val categoriaService: CategoriaService) {

    @PostMapping(
            value = ["/categorias"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun crearCategoria(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
        val productResponse = productService.create(body)
        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }

    @GetMapping(
            value = ["/categorias"],
            produces = ["application/json"]
    )
    fun listarCategorias(@RequestParam(value = "size", defaultValue = "10") size: Int,
                     @RequestParam(value = "page", defaultValue = "0") page: Int): WebResponse<List<ProductResponse>> {
        val request = ListProductRequest(page = page, size = size)
        val responses = CategoriaService.list(request)
        return WebResponse(
                code = 200,
                status = "OK",
                data = responses
        )
    }

    

}    
