package exercicioCompleto.processamentosDePedidosOnline;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {
    public static void main(String[] args) {
        System.out.println("-------- Sistema de processamento de pedidos ----------");
        List<PedidoOnline> listaPedidos = new ArrayList<>();

        listaPedidos.add(new PedidoOnline(101, "Mouse Gamer", 85.50, 3));
        listaPedidos.add(new PedidoOnline(102, "Teclado Mecânico", 150.00, 10));
        listaPedidos.add(new PedidoOnline(103, "Monitor 4K", 900.00, 1));
        listaPedidos.add(new PedidoOnline(104, "Webcam HD", 55.00, 6));

        System.out.println("\nTeste de Exceção (Tentativa de Reabastecer com 0) ---");
        PedidoOnline mouse = listaPedidos.get(0);
        try{
            mouse.transacionar(0.0);
        } catch (TransacaoInvalidaException e) {
            System.out.println("Erro Capturado: " + e.getMessage());
        }

        System.out.println("Desconto Lambda(10%)");

        ProcessadorDeValor desconto10 = (valorBase) -> valorBase * 0.90;

        double valorOriginal = 1000.00;
        double valorComDesconto = desconto10.processar(valorOriginal);
        System.out.println("Valor Original: $" + valorOriginal);
        System.out.println("Valor com Desconto: $" + String.format("%.2f", valorComDesconto));

        System.out.println("\n--- Pedidos com Quantidade > 5 (Filter + Lambda) ---");
        listaPedidos.stream()
                .filter(pedido -> pedido.getQuantidade() > 5) // Lambda como condição de filtro
                .forEach(System.out::println); // Method Reference (Lambda simplificada)

        // Stream e Lambda 2: Reduce (Cálculo do Valor Total)
        double totalGeral = listaPedidos.stream()
                .mapToDouble(PedidoOnline::calcularValorTotal) // Transforma a lista em Stream de Double
                .reduce(0.0, (subtotal, elemento) -> subtotal + elemento); // Lambda para soma

        System.out.println("\n--- 💲 Valor Total de Todos os Pedidos (Reduce + Lambda) ---");
        System.out.println("Total Geral da Carteira: $" + String.format("%.2f", totalGeral));
    }
}
