package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int numeroCreados = 0;
    public static ArrayList<Pais> listaPaises = new ArrayList<>();

    public Pais(String nombre){
        this.nombre = nombre;
        listaPaises.add(this);
    }

    public void registrar(){
        this.numeroCreados++;
    }

    public static Pais paisMasVendedor(){
        Pais max = listaPaises.get(0);
        for (Pais pais: listaPaises){
            if (pais.numeroCreados > max.numeroCreados){
                max = pais;
            }
        }
        return max;
    }

    public String getNombre(){return this.nombre;}
    public void  setNombre(String nombre){this.nombre = nombre;}
}
