package exerciciosMarcelo.src.provaMarcelo.sistemaVeiculo;

import java.util.ArrayList;
import java.util.List;

public class LocadoraVeiculos {
    public static void main(String[] args) {
        Frota<Veiculo> frota = new Frota<>();

        // ======================================================
        // INSERÇÃO DOS 15 VEÍCULOS
        // 8 CARROS
        // ======================================================
        frota.adicionar(new Carro("AAA-1111", "Gol",        120.0, false, 2018, 4));
        frota.adicionar(new Carro("BBB-2222", "Onix",       150.0, true,  2020, 4));
        frota.adicionar(new Carro("CCC-3333", "Corolla",    220.0, false, 2019, 4));
        frota.adicionar(new Carro("DDD-4444", "HB20",       130.0, false, 2021, 4));
        frota.adicionar(new Carro("EEE-5555", "Civic",      230.0, true,  2022, 4));
        frota.adicionar(new Carro("FFF-6666", "Fiesta",     110.0, false, 2017, 4));
        frota.adicionar(new Carro("GGG-7777", "Sandero",    125.0, false, 2018, 4));
        frota.adicionar(new Carro("HHH-8888", "Argo",       140.0, true,  2021, 4));

        // 3 MOTOS
        frota.adicionar(new Moto("III-9999", "CG 160",       80.0,  false, 2019, 160));
        frota.adicionar(new Moto("JJJ-0001", "Fazer 250",   100.0, true,  2020, 250));
        frota.adicionar(new Moto("KKK-0002", "XRE 300",     130.0, false, 2021, 300));

        // 4 CAMINHÕES
        frota.adicionar(new Caminhao("LLL-0003", "Cargo 2429",        400.0, false, 2018, 13.0));
        frota.adicionar(new Caminhao("MMM-0004", "Atego 2428",        420.0, true,  2019, 14.0));
        frota.adicionar(new Caminhao("NNN-0005", "VM 270",            450.0, false, 2020, 15.0));
        frota.adicionar(new Caminhao("OOO-0006", "Constellation 24.280", 470.0, false, 2021, 16.0));

        try {
            System.out.println("=============== Apresentando somente os carros ===============");
            List<Veiculo> carros = new ArrayList<>();
            carros = frota.getVeiculos();
            carros.stream().filter((veiculo) -> veiculo.getTipo().equals("Carro")).forEach((v) -> System.out.println(v));
            System.out.println();

            System.out.println("=============== Apresentando o mais caro e o mais barato ===============");
            System.out.println("Mais Caro\n" + frota.buscarMaisCaro());
            System.out.println("Mais Barato\n" + frota.buscarMenorPreco());
            System.out.println();

            System.out.println("=============== Apresentando todos os veículos ===============");
            frota.exibirTodos();
            System.out.println();

            System.out.println("=============== Aumentando em 20% o valor dos caminhões ===============");
            List<Veiculo> caminhao = new ArrayList<>();
            caminhao = frota.getVeiculos().stream().filter((cmnh) -> cmnh.getTipo().equals("Caminhão")).toList();
            for(Veiculo v : caminhao){
                v.reajustarDiaria(20);
            }
            for(Veiculo v : caminhao){
                System.out.println(v);
            }
            System.out.println();

            System.out.println("=============== Apresentando os Veículos não locados ===============");
            List<Veiculo> veiculoNaoLocado = new ArrayList<>();
            veiculoNaoLocado = frota.getVeiculos().stream().filter((nLock) -> !nLock.isLocado()).toList();
            for(Veiculo vLock : veiculoNaoLocado){
                System.out.println(vLock);
            }
            System.out.println();

            System.out.println("=============== Apresentando as motos locadas ===============");
            List<Veiculo> motosLocadas = new ArrayList<>();
            motosLocadas = frota.getVeiculos().stream().filter((mtLock) -> mtLock.getTipo().equals("Moto") && mtLock.isLocado()).toList();
            for(Veiculo mtLock : motosLocadas){
                System.out.println(mtLock);
            }
            System.out.println();

            System.out.println("=============== Utilizando as funcionalidades locáveis ===============");
            System.out.println("Alugando a moto: ");
            List<Veiculo> motosAlugadas = new ArrayList<>();
            motosAlugadas = frota.getVeiculos().stream().filter((mtalgd) -> mtalgd.getTipo().equals("Moto")).toList();
            motosAlugadas.get(0).alugar();
            System.out.println();
            System.out.println("Devolvendo a moto: ");
            List<Veiculo> motoADevolver = new ArrayList<>();
            motoADevolver = frota.getVeiculos().stream().filter((mtdvlv) -> mtdvlv.getTipo().equals("Moto")).toList();
            motoADevolver.get(1).devolver();
            System.out.println();

            System.out.println("=============== Calculando o aluguel de todos os veículos (10 dias) ===============");
           List<Veiculo> todosVeiculos = new ArrayList<>();
           todosVeiculos = frota.getVeiculos();
           for(Veiculo tdsvcl : todosVeiculos){
               System.out.println("Veículo: " + tdsvcl.getModelo() + ", R$" + tdsvcl.calcularValorAluguel(10));
           }

        }catch (Exception e){
            System.out.println("Erro!");
        }
    }
}
