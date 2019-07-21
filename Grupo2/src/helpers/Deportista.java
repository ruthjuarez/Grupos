/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author CARLOS HERRERA
 */
public class Deportista extends Persona {
    public Deportista(){
    
        setNombre("Jose Orlando");
        setApellido("Canizales");
        setEdad(22);
    }    

    @Override
    public String getNacionalidad() {
        return "Nacionalidad Brasileña";
    }
}
