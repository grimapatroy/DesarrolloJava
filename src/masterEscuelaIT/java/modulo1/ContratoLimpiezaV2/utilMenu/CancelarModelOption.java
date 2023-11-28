package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.utilMenu;

import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Console;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Date;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Empresa;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.ServicesContract;

public class CancelarModelOption extends ModelOption {
    public CancelarModelOption(ServicesContract servicesContract, Empresa empresa) {
        super("Cancelar Fecha de Contrato",servicesContract , empresa);
    }

    @Override
    public void interact() {
        this.servicesContract = this.empresa.capturarDatos();
        this.servicesContract.cancel(new Date(new Date().caputureDay() ,
                new Date().captureMonth(),
                this.empresa.getYear()));
        this.servicesContract.writeln();
        Console.getInstance().writeln("Costo Anual del contrato es : " +this.servicesContract.getCost());
    }
}
