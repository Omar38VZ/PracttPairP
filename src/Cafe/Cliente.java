package Cafe;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

public class Cliente {
    private String nombre;
    private String identificador;
    private List<Pedido> pedidos;

    public Cliente(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.pedidos = new ArrayList<>();
    }

    public void registrarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void verResumenConsumo() {
        System.out.println("\n--- Resumen de Consumo para " + nombre + " (" + identificador + ") ---");
        
        if (pedidos.isEmpty()) {
            System.out.println("El cliente no tiene pedidos registrados.");
            return;
        }

        double totalAcumuladoGastado = 0.0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        for (Pedido pedido : pedidos) {
            double totalPedido = pedido.calcularTotal(); 
            totalAcumuladoGastado += totalPedido;
            
            System.out.printf("  - %s: Pedido ID %s | Total: $%.2f%n", 
                              sdf.format(pedido.getFecha()), 
                              pedido.getIdPedido(), 
                              totalPedido);
        }
            
        System.out.println("--------------------------------------------------");
        System.out.printf("TOTAL ACUMULADO GASTADO: $%.2f%n", totalAcumuladoGastado);
        System.out.println("--------------------------------------------------");
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }
}