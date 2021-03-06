package teste;

import oo.*;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo v = new Veiculo(200);
        v.setMarca("VW");
        v.setModelo("FOX");
        v.setAno(2020);
        v.setPlaca("HGB-8989");
        v.acelerar(10);
        System.out.println(v.getVelocidade());
        v.acelerar(50);
        System.out.println(v.getVelocidade());
        v.acelerar(300);
        System.out.println(v.getVelocidade());

        Motorista m = new Motorista();
        m.setNome("João da Silva");
        m.setCnh("ALSKJ987342983");

        v.setMotorista(m);

        Estado e = new Estado();
        e.setNome("Santa Catarina");
        e.setSigla("SC");

        Cidade c = new Cidade();
        c.setNome("Florianópolis");
        c.setEstado(e);

        m.setCidade(c);

        System.out.println(v.getMotorista().getCidade().getEstado().getSigla());

        Moto moto = new Moto(180);
        moto.setMarca("Honda");
        moto.setModelo("XHJ450");
        moto.acelerar(50);
        exibirVelocidade(moto);

        Lancha lancha = new Lancha(200);
        lancha.setMarca("Lanchex");
        lancha.setModelo("Modafoca");
        lancha.setTurbo(true);
        lancha.acelerar(100);
        exibirVelocidade(lancha);

        BicicletaMotor bm = new BicicletaMotor(50);
        bm.ligarMotor();
        bm.desligarMotor();

    }

    // Polimorfismo de objeto
    public static void exibirVelocidade(Veiculo veiculo) {
        System.out.println("Marca.....: "+veiculo.getMarca());
        System.out.println("Modelo....: "+veiculo.getModelo());
        System.out.println("Velocidade: "+veiculo.getVelocidade());
    }
}
