package Facade;

public class Impresora {

    private String TipoDocumento;
    private String hoja;
    private boolean color;
    private String texto;

    //Generacion de le metodos getters me devuelve la propiedad del objeto y setters toma el
    //toma el parametro asignado para asignarlo a el
    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getHoja() {
        return hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    //metodo para imprimir el concatenado de cada uno de los atributos
    public void imprimirdocumento(){
        System.out.println("Imprimiendo: " +texto +"\n" + "Color:" +
                color +"\n"+"Tipo de Documento: "+ TipoDocumento +"\n"+
                "Tipo de hoja: "+ hoja);
    }
}
