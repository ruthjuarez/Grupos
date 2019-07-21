
package grupo2;

import helpers.Deportista;
import helpers.Estudiante;


public class Grupo2 {

    public static void main(String[] args) {
          // TODO code application logic here
        Estudiante in = new Estudiante();
        Deportista on = new Deportista();
        
        System.out.println("Datos Estudiante:");
        System.out.println(in.getNacionalidad());
        in.informacion();
        System.out.println();
        System.out.println("Datos Deportista:");
        System.out.println(on.getNacionalidad());
        on.informacion();
        
    }
}
