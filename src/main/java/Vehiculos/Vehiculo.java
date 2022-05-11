package Vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    public static int cantidadVehiculos;

    public static int automoviles = 0;
    public static int camionetas = 0;
    public static int camiones = 0;


    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio,
                    int peso, String traccion,  Fabricante fabricante){
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.registrar();
        cantidadVehiculos++;
    }


    public String getPlaca(){return this.placa;}
    public void setPlaca(String placa){this.placa = placa;}

    public int getPuertas(){return this.puertas;}
    public void setPuertas(int puertas){this.puertas = puertas;}

    public int getVelocidadMaxima(){return this.velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima){this.velocidadMaxima = velocidadMaxima;}

    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getPrecio(){return this.precio;}
    public void setPrecio(int precio){this.precio = precio;}

    public int getPeso(){return this.peso;}
    public void setPeso(int peso){this.peso = peso;}

    public String getTraccion(){return this.traccion;}
    public void setTraccion(String traccion){this.traccion = traccion;}

    public Fabricante getFabricante(){return this.fabricante;}
    public void setFabricante(Fabricante fabricante){this.fabricante = fabricante;}

    public static int getCantidadVehiculos(){return Vehiculo.cantidadVehiculos;}
    public static void setCantidadVehiculos(int cantidadVehiculos){Vehiculo.cantidadVehiculos = cantidadVehiculos;}

    private void registrar(){
        this.getFabricante().registrar();
        this.getFabricante().getPais().registrar();
    }

    public String vehiculosPorTipo(){
        return "Automoviles: "+Vehiculo.automoviles +
                "Camionetas: "+Vehiculo.camionetas+"\n" +
                "Camiones: "+Vehiculo.camiones;
    }

}
