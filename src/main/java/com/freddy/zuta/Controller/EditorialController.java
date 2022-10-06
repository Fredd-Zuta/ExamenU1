
package com.freddy.zuta.Controller;

import com.freddy.zuta.Entity.Editorial;
import com.freddy.zuta.Service.EditorialService;
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
@RequestMapping("/editorial")
@Api(value = "Microservicio de Editoriales", description = "Microservicio de Editoriales")
public class EditorialController {
    
    @Autowired
    EditorialService editorialService;

    @ApiOperation(value = "Lista de editorials")
    @GetMapping
    public List<Editorial> findAll() {
        return editorialService.findAll();
    }

    @ApiOperation(value = "Lista una editorial")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id) {
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @ApiOperation(value = "Crea una editorial")
    @PostMapping
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

    @ApiOperation(value = "Elimina una editorial")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);
    }
}
