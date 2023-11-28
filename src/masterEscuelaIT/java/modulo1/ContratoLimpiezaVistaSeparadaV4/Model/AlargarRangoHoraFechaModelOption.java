package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract.ModelOption;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Console;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.DateView;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.ServicesContractView;

public class AlargarRangoHoraFechaModelOption extends ModelOption {
    public AlargarRangoHoraFechaModelOption(ServicesContract servicesContract
            , EmpresaView empresaView) {
        super("ALARGAR RANGO DE HORAS PARA EL CONTRATO",
                servicesContract,
                empresaView);
    }

    @Override
    public void interact() {
        this.servicesContract = this.empresaView.capturarDatos();
        double  interval = Console.getInstance().readDouble("INGRESA LA ESCALA");
        this.servicesContract.enlarge(new Date(new DateView().caputureDay()
                ,new DateView().captureMonth()
                ,this.empresaView.getYear()),interval);
        new ServicesContractView(this.servicesContract).writeln();
        Console.getInstance().writeln("Costo anual del contrato: "+this.servicesContract.getCost());
    }
}
