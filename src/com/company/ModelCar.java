package com.company;

public class ModelCar {
    private String nume;
    private String marca;
    private String model;

    public ModelCar(String nume, String marca, String model){
        this.nume = nume;
        this.marca = marca;
        this.model = model;
    }

    public String GetNume(){
        return nume;
    }

    public String SetNume(String nume){
        this.nume = nume;
    }

    public String GetMarca(){
        return marca;
    }

    public String SetMarca(String marca){
        this.marca = marca;
    }

    public String GetModel(){
        return model;
    }

    public String SetModel(String model){
        this.model = model;
    }

    public void Afis(){
        System.out.println("Nume: " + nume);
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
    }

    public static void main(String[] args){


    }
}
