
package com.utn.trabajointegrador;

import lombok.Data;



@Data
public class Cliente {
  
    private String razonSocial;
    private String cuit;

    public Cliente() {
    }

    public Cliente(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
  
}
