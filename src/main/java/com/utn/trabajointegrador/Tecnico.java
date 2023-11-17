
package com.utn.trabajointegrador;

import java.util.List;
import lombok.Data;

@Data
public class Tecnico {
     private String nombre;
    private List<String> especialidades;

    public Tecnico() {
    }

    public Tecnico(String nombre, List<String> especialidades) {
        this.nombre = nombre;
        this.especialidades = especialidades;
    }
    
}
