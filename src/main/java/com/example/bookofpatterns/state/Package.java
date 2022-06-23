package com.example.bookofpatterns.state;

public class Package {
    private PackageState state = new OrderedState();

    public void previousState(){
        state.prev(this);
    }
    public void nextState(){
        state.next(this);

    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
