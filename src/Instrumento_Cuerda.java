public class Instrumento_Cuerda extends tipo_instrumento {
    String caracteristica;
    int precio;

    public Instrumento_Cuerda(String nombre, String marca, String anio_fabricacion,  String tipo, String caracteristica, int precio) {
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

    @Override
    public void imprimir_instrumento() {
        super.imprimir_instrumento();
        System.out.println("Instrumento de cuerda");
        System.out.println("El instrumento de cuerda es: " + this.getCaracteristica() );
        System.out.println("El precio del instrumento es: " + this.getPrecio());
    }
}
