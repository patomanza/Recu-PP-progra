package recu.primer.parcial;


public class Flor extends Planta{
    
    private Temporada temporadaCrecimiento;

    public Flor(String nombre, String ubicacion, String clima,Temporada temporadaCrecimiento) {
        super(nombre, ubicacion, clima);
        this.temporadaCrecimiento = temporadaCrecimiento;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ", Temporada de Florecimiento: " + temporadaCrecimiento;
    }
    
}
