import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA CON MÚLTIPLES EQUIPOS ===");
        List<EquipoCocina> equipos = new ArrayList<>();
        equipos.add(new Cafetera());
        equipos.add(new Licuadora());
        equipos.add(new MaquinaTe());
        equipos.add(new Exprimidor());

        for (EquipoCocina equipo : equipos) {
            equipo.encender();
            equipo.ajustarIntensidad();
            equipo.preparar();
            equipo.apagar();
            System.out.println();
        }
    }
}
