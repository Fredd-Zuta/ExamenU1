
package com.freddy.zuta.Repository;

import com.freddy.zuta.Entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Freddy
 */
@Repository
public interface LibroRepository extends CrudRepository<Libro, Long> {
    
}
