public class tipo_instrumento extends Instrumentos_Musicales{
    String tipo;

    public tipo_instrumento(String tipo) {
        this.tipo = tipo;
    }

    public tipo_instrumento(String nombre, String marca, String anio_fabricacion, String tipo) {
        super(nombre, marca, anio_fabricacion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir_instrumento(){
        super.imprimir_instrumento();
        System.out.println("El tipo de instrumento es: " + this.getTipo());
    }

}
