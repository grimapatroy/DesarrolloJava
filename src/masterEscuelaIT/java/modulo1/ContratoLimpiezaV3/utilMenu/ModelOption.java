package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.Empresa;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.ServicesContract;

abstract class ModelOption extends Option {
    protected ServicesContract servicesContract;
    protected Empresa empresa;


    public ModelOption(String string, ServicesContract servicesContract , Empresa empresa) {
        super(string);
        this.empresa = empresa;
        this.servicesContract = servicesContract;
    }

}
