
package com.freddy.zuta.Controller;

import com.freddy.zuta.Entity.Libro;
import com.freddy.zuta.Service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author freddy
 */
@RestController
@RequestMapping("/libro")
@Api(value = "Microservicio de Libros", description = "Microservicio de Libros")
public class LibroController {
    
    @Autowired
    LibroService libroService;

    @ApiOperation(value = "Lista de libros")
    @GetMapping
    public List<Libro> findAll() {
        return libroService.findAll();
    }

    @ApiOperation(value = "Lista una libro")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id) {
        Libro libro = libroService.findById(id);
        return ResponseEntity.ok(libro);
    }

    @ApiOperation(value = "Crea una libro")
    @PostMapping
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @ApiOperation(value = "Elimina una libro")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        libroService.deleteById(id);
    }
}
