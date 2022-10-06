
package com.freddy.zuta.Service;

import com.freddy.zuta.Entity.Libro;
import java.util.List;

/**
 *
 * @author freddy
 */
public interface LibroService {
    
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro save(Libro libro);

    public void delete(Libro libro);

    public void deleteById(Long id);
}
