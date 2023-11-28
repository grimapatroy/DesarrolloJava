package src.javaAfondo.InterfazComparable.comunicador.util;

import src.javaAfondo.InterfazComparable.comunicador.Comunicador;
import src.javaAfondo.InterfazComparable.comunicador.PalomaMensaje;


public class ComunicadorManager {

    public static Comunicador crearComunicador(){
        return new PalomaMensaje();
    }


}
