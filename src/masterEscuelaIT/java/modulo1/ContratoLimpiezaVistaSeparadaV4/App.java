package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.ModelIterativeMenu;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.ServicesContract;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run (){
        Console.getInstance().writeln("BIENVENIDOS A LA GESTION DE CONTRATOS POR FECHAS");
//        new ModelMenu(new ServicesContract(),new Empresa()).interact();
        new ModelIterativeMenu(new ServicesContract(),new EmpresaView()).interact();
    }
}


