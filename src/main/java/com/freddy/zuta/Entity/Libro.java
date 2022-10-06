
package com.freddy.zuta.Entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author freddy
 */
@Data
@Entity
@Table (name = "libros")
public class Libro implements Serializable {
    
    @Id
    @Column(name = "lib_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libId;

    @Column(name = "lib_titulo")
    private String libTitulo;

    @Column(name = "lib_autor")
    private String libAutor;
    
    @Column(name = "lib_year")
    private String libYear;
    
    @Column(name = "lib_idioma")
    private String libIdioma;
    
    @ManyToOne
    @JoinColumn(name = "edit_id")
    private Editorial editorial;
    
}
