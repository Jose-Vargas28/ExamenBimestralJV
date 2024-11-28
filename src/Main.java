import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      //crear objetos


        // llamar a objetos por nivel
        Instrumentos_Musicales instrumento1 = new Instrumentos_Musicales("Gitarra","Yamaha", "2020");
        instrumento1.imprimir_instrumento();

        tipo_instrumento instrumento2 = new tipo_instrumento("Guitarra", "Classic Marc","2017", "Cuerda");
        instrumento2.imprimir_instrumento();

        Instrumento_Cuerda instrumento3 = new Instrumento_Cuerda("Guitarra", "Rock star", "2018", "Cuerda",
                "Guitarra eléctrica", 800);
        instrumento3.imprimir_instrumento();

        // con seteo y datos adicionales
        Instrumento_Viento instrumento4 = new Instrumento_Viento("Flauta", "Yamaha", "2019",
                "Viento","Flauta tradicional", 10);

        instrumento4.setPrecio(60);
        instrumento4.imprimir_instrumento();
        instrumento4.dato_viento();

        // con manejo de excepción


        try {
            System.out.print("Ingrese del instrumento: ");
            String Nombre = scanner.nextLine();

            System.out.print("Ingrese la marca del instrumento: ");
            String Marca = scanner.nextLine();

            System.out.print("Ingrese el año de fabricación del instrumento: ");
            String anio_fabricacion = scanner.nextLine();

            Instrumento_Cuerda instrumento5 = new Instrumento_Cuerda("Guitarra","Yamaha", "2017","Cuerda","guitrra eléctrica", 200);
            instrumento5.imprimir_instrumento();

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el instrumento: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error de entrada/salida: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}