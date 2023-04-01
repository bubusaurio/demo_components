package java_components;


public class ListaDestinos {
    private Viaje destinos;

    public ListaDestinos(){
        destinos = null;
    }

    public void agregar(String n, String p, String c, String d){
        Viaje nuevo = new Viaje();
        nuevo.setNumero(n);
        nuevo.setPais(p);
        nuevo.setCiudad(c);
        nuevo.setDias(d);

        if(destinos == null){
            destinos = nuevo;
        }

        else{
            Viaje aux = destinos;

            while(aux.getNext() != null){
                aux = aux.getNext();
            }

            aux.setNext(nuevo);
        }
    }

    public String recorrerDestinos(){
        String datos = "";
        Viaje aux = destinos;
        if(destinos == null){
            datos = "La lista esta vacia";
        }

        else{
            while(aux != null){
                datos += "Numero: " + aux.getNumero() + "\n";
                datos += "Viaje: " + aux.getPais() + "-";
                datos += aux.getCiudad() + "\n";
                datos += "Dias: " + aux.getDias() + "\n";
                aux = aux.getNext();
            }
        }
        return datos;
    }

    public boolean isEmpty(){
        if(destinos == null){
            return true;
        }
        else{
            return false;
        }
    }
    
}
