package Padroes.observer;

import Padroes.Namorada;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Porteiro porteiro = new Porteiro();

        Namorada namorada = new Namorada();

        porteiro.registraObservador(namorada);

        porteiro.registraObservador(e -> {
                System.out.println("Surpresa via lambda");
                System.out.println("Ocorreu em " + e.getMomento());

    });
    porteiro.monitorar();
}
    }
