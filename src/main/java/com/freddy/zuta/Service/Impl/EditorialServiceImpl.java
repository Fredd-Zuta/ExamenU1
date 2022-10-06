
package com.freddy.zuta.Service.Impl;

import com.freddy.zuta.Entity.Editorial;
import com.freddy.zuta.Repository.EditorialRepository;
import com.freddy.zuta.Service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author freddy
 */
@Service
public class EditorialServiceImpl implements EditorialService{
    
    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialRepository.findAll();
    }

    @Override
    public Editorial findById(Long id) {
        return editorialRepository.findById(id).orElse(null);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
        editorialRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
        editorialRepository.deleteById(id);
    }
}
