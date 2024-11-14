package recu.primer.parcial;

public abstract class Planta {
    
    protected String nombre;
    protected String ubicacion;
    protected String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        if (nombre == null || nombre.isEmpty()) {
            throw new DatosInvalidosException("El nombre no puede ser nulo o vacío.");
        }
        if (ubicacion == null || ubicacion.isEmpty()) {
            throw new DatosInvalidosException("La ubicación no puede ser nula o vacía.");
        }
        if (clima == null || clima.isEmpty()) {
            throw new DatosInvalidosException("El clima no puede ser nulo o vacío.");
        }
        
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
        
        
    }

    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Ubicacion: " + ubicacion + ", Clima: " + clima;
    }


    
    
    
    
    
}
