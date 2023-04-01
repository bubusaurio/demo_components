package java_components;

public class Viaje {
    
    private String Numero;
    private String Pais;
    private String Ciudad;
    private String Dias;

    private Viaje next;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }

    public Viaje getNext(){
        return next;
    }

    public void setNext(Viaje next){
        this.next = next;
    }

}
