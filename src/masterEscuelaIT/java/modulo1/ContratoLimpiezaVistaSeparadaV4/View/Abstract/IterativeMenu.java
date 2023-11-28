package src.masterEscuelaIT.java.modulo1.ContratoLimpiezaVistaSeparadaV4.View.Abstract;

public abstract class IterativeMenu extends QuitMenu {

    public IterativeMenu(String title) {
        super(title);
    }

    public void interact(){
        this.addOptions();
        do {
            this.interact_();
        } while (!this.isExecutedquitOption());
    }
}
