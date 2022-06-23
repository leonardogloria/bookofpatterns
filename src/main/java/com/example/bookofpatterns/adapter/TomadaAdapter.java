package com.example.bookofpatterns.adapter;

public class TomadaAdapter extends TomadaDeDoisPinos{
    TomadaDeTresPinos tomadaDeTresPinos;

    public TomadaAdapter(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }
    public void ligarNaTomadaDe2Pinos(){
        this.tomadaDeTresPinos.ligarNaTomada();
    }
}
