
package helpers;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    
    public Persona(){
    
    } 
     public void setNombre(String nombre){
      this.nombre = nombre;
     }       
     public String getNombre(){
        return this.nombre;
     }
     public void setApellido(String apellido){
      this.apellido = apellido;
     }       
     
     public String getApellido(){
        return this.apellido;
     }
     public void setEdad(int edad){
      this.edad = edad;
     }       
     
     public int getEdad(){
        return this.edad;
     }
     public void setAltura(int altura){
         this.altura=altura;
     }

     public int getAltura(){
        return this.altura;
     }
     
     public void informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " cm");
     }
     
     abstract String getNacionalidad();
}


