import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {

    public static void main(String[] args) {

        List<EquipoCocina> equipos = new ArrayList<>();
        equipos.add(new Cafetera());
        equipos.add(new Licuadora());
        equipos.add(new MaquinaTe());
        equipos.add(new Exprimidor());

        System.out.println("=== PRUEBA CON MÚLTIPLES EQUIPOS ===");
        PreparadorBebidasV2 preparador = new PreparadorBebidasV2(equipos);
        preparador.prepararBebida();
    }
}
