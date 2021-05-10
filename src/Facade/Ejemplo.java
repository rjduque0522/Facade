package Facade;

public class Ejemplo {

    public  static void main(String[] args){
        //nombre del texto que nos esta solicitando
        Facade facade= new Facade("Texto 1");
        /*Carga toda la informacion de nuestra clase Facade instanciandola y dandole como
       resultado el atributo que se sobre carga en la clase impresora
        * */
        facade.imprimir();

        /*Siendo asi que la clase impresora no conoce la clase facade, pero la clase facade
        si el cliente interactua rapidamente con la clase paquete
        *
        * */

    }
}
