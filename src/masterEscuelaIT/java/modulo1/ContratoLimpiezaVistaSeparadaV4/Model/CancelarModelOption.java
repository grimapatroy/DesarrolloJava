package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.ModelOption;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.DateView;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.ServicesContractView;

public class CancelarModelOption extends ModelOption {
    public CancelarModelOption(ServicesContract servicesContract, EmpresaView empresaView) {
        super("Cancelar Fecha de Contrato",servicesContract , empresaView);
    }

    @Override
    public void interact() {
        this.servicesContract = this.empresaView.capturarDatos();
        this.servicesContract.cancel(new Date(new DateView().caputureDay()
                                    ,new DateView().captureMonth()
                                    ,this.empresaView.getYear()));
        new ServicesContractView(this.servicesContract).writeln();
        Console.getInstance().writeln("Costo Anual del contrato es : " +this.servicesContract.getCost());
    }
}
