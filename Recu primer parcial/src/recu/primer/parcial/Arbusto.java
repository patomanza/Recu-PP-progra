
package recu.primer.parcial;


public class Arbusto extends Planta implements Podar{
    
    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima,int densidadFollaje) {
        super(nombre, ubicacion, clima);
        this.densidadFollaje = densidadFollaje;
    }

    @Override
     public void podar() {
        System.out.println("Podando al arbusto: " + nombre);
    }
    
    @Override
   public String toString() {
        return super.toString() + ", Densidad del Follaje: " + densidadFollaje;
    }
    
}
