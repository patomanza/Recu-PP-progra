package recu.primer.parcial;

import java.util.List;
import java.util.ArrayList;

public class Jardin {
    
    private List<Planta> plantas;
        
    public Jardin(){
        plantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta) throws PlantaDuplicadaException{
        for(Planta p : plantas){
            if(p.nombre.equals(planta.nombre) && p.ubicacion.equals(planta.ubicacion)){
                throw new PlantaDuplicadaException("Ya existe una planta con mismo nombre y ubicacion");
            }
        }
        plantas.add(planta);
        System.out.println("Se agrego con exito la siguiente planta: " + planta.nombre);
    }
    
    
     public void mostrarPlantas() {
        System.out.println("Plantas en el Jardin: ");
        for (Planta planta : plantas) {
            System.out.println(planta);
        }
    }

    public void podarPlantas() {
        for (Planta planta : plantas) {
            if (planta instanceof Podar) {
                ((Podar) planta).podar();
            } else {
                System.out.println("La planta " + planta.nombre + " no se puede podar.");
            }
        }
    }
    
    
}
