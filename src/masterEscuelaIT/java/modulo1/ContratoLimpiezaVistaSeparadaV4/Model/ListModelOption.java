package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.ModelOption;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.ServicesContractView;

class ListModelOption extends ModelOption {

    public ListModelOption(ServicesContract servicesContract , EmpresaView empresaView) {
        super("Listar Costo Anual", servicesContract , empresaView);
    }

    public void interact() {
//        programa lo que va hacer el metodo !!
        this.servicesContract = this.empresaView.capturarDatos();
//        this.servicesContract.writeln();
        new ServicesContractView(this.servicesContract).writeln();
        Console.getInstance().writeln("Coste anual del contrato: " + this.servicesContract.getCost());
    }


}
