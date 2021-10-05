package com.jr.frutasa.Clases;

public class Cargo {



    private String NombreCargo;
    private int ID;


    public Cargo(String nombreCargo, int ID) {
        NombreCargo = nombreCargo;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCargo() {
        return NombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        NombreCargo = nombreCargo;
    }



}
