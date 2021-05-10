package Facade;

public class Facade {

    //se llama desde la clase impresora
    private  Impresora impresora;

    public Facade(String texto){
/**
 * se llama el metodo principal de la clase impresora
 */
        super();
        //instancia de la clase impresora
        impresora= new Impresora();
        // la variable que colocamos con la clase, opteniendo asi cada uno de los atributos
        impresora.setColor(true);
        //se envia cada objeto a la clase impresora
        impresora.setHoja("A5");
        impresora.setTipoDocumento("PDF");
        //
        impresora.setTexto(texto);

    }

    public  void  imprimir(){

        //obetenemos el metodo que declaramos en la clase impresora

        impresora.imprimirdocumento();
    }
}
