public class PreparadorBebidas {
    private final EquipoCocina equipo1;
    private final EquipoCocina equipo2;

    public PreparadorBebidas(EquipoCocina equipo1, EquipoCocina equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void prepararBebida() {
        equipo1.encender();
        equipo2.encender();
        equipo1.ajustarIntensidad();
        equipo2.ajustarIntensidad();
        equipo1.preparar();
        equipo2.preparar();
    }

    public void apagarEquipos() {
        equipo1.apagar();
        equipo2.apagar();
    }
}