import java.util.List;

public class PreparadorBebidasV2 {
// se consulta manejo de listas implementando con If 
    private List<EquipoCocina> equipos;

    // al manejar la inyeccion de dependencia se entiende que la lista llega desde afuera
    public PreparadorBebidasV2(List<EquipoCocina> equipos) {
        if (equipos == null || equipos.isEmpty()) {
            throw new IllegalArgumentException("Debe haber al menos un equipo.");
        }
        this.equipos = equipos;
    }

    public void prepararBebida() {
        System.out.println("Iniciando preparacion con " + equipos.size() + " equipos...");
        for (EquipoCocina equipo : equipos) {
            equipo.encender();
        }
        for (EquipoCocina equipo : equipos) {
            equipo.ajustarIntensidad();
        }
        for (EquipoCocina equipo : equipos) {
            equipo.preparar();
        }
        System.out.println("¡Preparacion completada!");
    }

    public void apagarEquipos() {
        System.out.println("Cerrando servicio...");
        for (EquipoCocina equipo : equipos) {
            equipo.apagar();
        }
        System.out.println("Todos los equipos se han apagado con exito.");
    }
}