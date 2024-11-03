package restaurant;

public class Restaurant {
    String nombre;
    long telefono;
    String direccion;
    String id;
   
    public  Restaurant(String nombre, int telefono, String direccion, String id){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre =  nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
