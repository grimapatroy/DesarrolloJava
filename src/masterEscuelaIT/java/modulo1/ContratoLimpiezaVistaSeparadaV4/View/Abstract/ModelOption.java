package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.Model.ServicesContract;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.EmpresaView;

public abstract class ModelOption extends Option {
    protected ServicesContract servicesContract;
    protected EmpresaView empresaView;


    public ModelOption(String string, ServicesContract servicesContract , EmpresaView empresaView) {
        super(string);
        this.empresaView = empresaView;
        this.servicesContract = servicesContract;
    }

}
