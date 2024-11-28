public class Instrumento_Viento extends tipo_instrumento{
    String caracteristica;
    int precio;

    public Instrumento_Viento(String nombre, String marca, String anio_fabricacion,  String tipo, String caracteristica, int precio) {
        super(nombre, marca, anio_fabricacion, tipo);
        this.caracteristica = caracteristica;
        this.precio = precio;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public void imprimir_instrumento() {
        super.imprimir_instrumento();
        System.out.println("Instrumento de cuerda");
        System.out.println("El instrumento de cuerda es: " + this.getCaracteristica() );
        System.out.println("El precio del instrumento es: " + this.getPrecio());
    }

    public void dato_viento(){
        System.out.println("Ideal para estudiantes de colegio");
    }
}
