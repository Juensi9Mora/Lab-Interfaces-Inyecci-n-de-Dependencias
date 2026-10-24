import java.util.List;

public class PreparadorBebidasV2 {
    private List<EquipoCocina> equipos;

    public PreparadorBebidasV2(List<EquipoCocina> equipos) {
        this.equipos = equipos;
    }

    public void prepararBebida() {
        for (EquipoCocina equipo : equipos) {
            equipo.encender();
            equipo.ajustarIntensidad();
            equipo.preparar();
        }
    }

    public void apagarEquipos() {
        for (EquipoCocina equipo : equipos) {
            equipo.apagar();
        }
    }
}
