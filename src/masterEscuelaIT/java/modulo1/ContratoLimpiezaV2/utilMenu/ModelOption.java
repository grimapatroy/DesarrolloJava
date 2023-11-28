package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.utilMenu;


import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.Empresa;
import src.masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.ServicesContract;

abstract class ModelOption extends Option {
    protected ServicesContract servicesContract;
    protected Empresa empresa;


    public ModelOption(String string,ServicesContract servicesContract , Empresa empresa) {
        super(string);
        this.empresa = empresa;
        this.servicesContract = servicesContract;
    }

}
