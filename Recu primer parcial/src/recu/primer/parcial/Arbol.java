package recu.primer.parcial;


public class Arbol extends Planta implements Podar {
    
    private double maxAltura;

    public Arbol(String nombre, String ubicacion, String clima,double maxAltura) {
        super(nombre, ubicacion, clima);
        this.maxAltura = maxAltura;
    }

    @Override
    public String toString() {
        return super.toString() + ", Altura Maxima: " + maxAltura + "metros";
    }
    
    public void podar() {
        System.out.println("Podando al arbol: " + nombre);
    }
    
    
}
