package com.example.bookofpatterns.observer;

public class Editor {
    public EventManager events;

    public Editor() {
        this.events = new EventManager("open", "save");
    }
    public void openFile(String filePath){
        //O arquivo foi aberto.
        events.notify("open");
    }
    public void saveFile(){
        //O arquivo foi salvo
        events.notify("save");
    }
}
