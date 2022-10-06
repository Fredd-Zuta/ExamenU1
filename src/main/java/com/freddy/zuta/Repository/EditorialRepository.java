
package com.freddy.zuta.Repository;

import com.freddy.zuta.Entity.Editorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author freddy
 */
@Repository
public interface EditorialRepository extends CrudRepository<Editorial, Long> {
    
}
