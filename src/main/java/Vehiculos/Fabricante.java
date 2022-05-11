package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int numeroCreados = 0;
    public static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);

    }

    public void registrar(){
        this.numeroCreados++;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante max = fabricantes.get(0);

        for (Fabricante fabricante: fabricantes){
            if (fabricante.numeroCreados > max.numeroCreados){
                max = fabricante;
            }
        }
        return max;
    }

    public String getNombre(){return this.nombre;}
    public void  setNombre(String nombre){this.nombre = nombre;}

    public Pais getPais(){return this.pais;}
    public void  setPais(Pais pais){this.pais = pais;}
}
