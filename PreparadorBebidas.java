public class PreparadorBebidas {
// se toma el ejemplo de CasaInteligente Flexible para inyeccion de dependencias
    private EquipoCocina equipo1;
    private EquipoCocina equipo2;

    // Inyeccion de dependencias manejando un constructor
    public PreparadorBebidas(EquipoCocina equipo1, EquipoCocina equipo2) {
        if (equipo1 == null || equipo2 == null) {
            throw new IllegalArgumentException("Los equipos no pueden ser null.");
        }
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void prepararBebida() {
        System.out.println("Iniciando preparacion de la bebida...");
        equipo1.encender();
        equipo2.encender();
        equipo1.ajustarIntensidad();
        equipo2.ajustarIntensidad();
        equipo1.preparar();
        equipo2.preparar();
        System.out.println("¡Preparacion completada!");
    }

    public void apagarEquipos() {
        System.out.println("Cerrando servicio...");
        equipo2.apagar();
        equipo1.apagar();
        System.out.println("Todos los equipos se han apagado con exito.");
    }
}