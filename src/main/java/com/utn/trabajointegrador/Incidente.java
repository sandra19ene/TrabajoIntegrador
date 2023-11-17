

package com.utn.trabajointegrador;

import java.util.Date;
import lombok.Data;

@Data
public class Incidente {
    private Cliente cliente;
    private String servicio;
    private String descripcion;
    private String tipoProblema;
    private Tecnico tecnicoAsignado;
    private Date fechaIngreso;
    private Date fechaPosibleResolucion;

    public Incidente() {
    }

    public Incidente(Cliente cliente, String servicio, String descripcion, String tipoProblema, Tecnico tecnicoAsignado, Date fechaIngreso, Date fechaPosibleResolucion) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.descripcion = descripcion;
        this.tipoProblema = tipoProblema;
        this.tecnicoAsignado = tecnicoAsignado;
        this.fechaIngreso = fechaIngreso;
        this.fechaPosibleResolucion = fechaPosibleResolucion;
    }
    
    
}
