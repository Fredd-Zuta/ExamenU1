
package com.freddy.zuta.Service;

import com.freddy.zuta.Entity.Editorial;
import java.util.List;

/**
 *
 * @author freddy
 */
public interface EditorialService {
    
    public List<Editorial> findAll();

    public Editorial findById(Long id);

    public Editorial save(Editorial editorial);

    public void delete(Editorial editorial);

    public void deleteById(Long id);
}
