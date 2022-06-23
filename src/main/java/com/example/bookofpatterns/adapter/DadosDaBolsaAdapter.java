package com.example.bookofpatterns.adapter;

public class DadosDaBolsaAdapter extends BibliotecadeGraficos{
    DadosDaBolsa dadosDaBolsa;

    public DadosDaBolsaAdapter(DadosDaBolsa dadosDaBolsa) {
        this.dadosDaBolsa = dadosDaBolsa;
    }
    public void exibeGraficosComXml(){
        String json = convertDadosParaJson();
        geraGraficosAtravesDeJson(json);
    }

    private String convertDadosParaJson() {
        dadosDaBolsa.getDadosEmXml();
        System.out.println("Convertendo eles para JSON");
        return "Dados em Json";
    }
}
