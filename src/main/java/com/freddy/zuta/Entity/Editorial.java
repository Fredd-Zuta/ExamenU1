
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
@Table(name = "editoriales")
public class Editorial implements Serializable{
    @Id
    @Column(name = "edit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long editId;

    @Column(name = "edit_nombre")
    private String editNombre;

    @Column(name = "edit_description")
    private String editDescription;
}
