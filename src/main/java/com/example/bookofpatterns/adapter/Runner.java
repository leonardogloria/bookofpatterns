package com.example.bookofpatterns.adapter;

public class Runner {
    public static void main(String[] args) {
        /*TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();
        TomadaAdapter tomadaAdapter = new TomadaAdapter(tomadaDeTresPinos);
        tomadaAdapter.ligarNaTomadaDe2Pinos();*/

        DadosDaBolsa dadosDaBolsa = new DadosDaBolsa();
        DadosDaBolsaAdapter dadosDaBolsaAdapter = new DadosDaBolsaAdapter(dadosDaBolsa);
        dadosDaBolsaAdapter.exibeGraficosComXml();


    }
}
