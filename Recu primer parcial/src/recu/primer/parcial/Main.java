package recu.primer.parcial;


public class Main {

    
    public static void main(String[] args) {
        Jardin jardin = new Jardin();

        try {
            Arbol arbol = new Arbol("Palmera", "Sector A", "Tropical", 20.5);
            Arbusto arbusto = new Arbusto("Aloe", "Sector B", "Arido", 8);
            Flor flor = new Flor("Rosa", "Sector C", "Templado", Temporada.PRIMAVERA);
          
            jardin.agregarPlanta(arbol);
            jardin.agregarPlanta(arbusto);
            jardin.agregarPlanta(flor);

            jardin.mostrarPlantas();
            jardin.podarPlantas();

        } catch (PlantaDuplicadaException e) {
            System.out.println(e.getMessage());
        }catch (DatosInvalidosException e) {
            System.out.println("Error en los datos de la planta: " + e.getMessage());
        }
    }
}
    
