public class Instrumentos_Musicales {
    String Nombre;
    String Marca;
    String anio_fabricacion;

    public Instrumentos_Musicales() {
    }
    public Instrumentos_Musicales(String nombre, String marca, String anio_fabricacion) {
        this.Nombre = nombre;
        this.Marca = marca;
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = Marca;
    }

    public String getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(String anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public void imprimir_instrumento(){
        System.out.println("Los datos del instrumento musical son: ");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("La marca es: " + this.getMarca());
        System.out.println("El año de fabricación es: " + this.getAnio_fabricacion());
S
    }

}
