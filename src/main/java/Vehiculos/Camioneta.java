package vehiculos;

public class Camioneta extends Vehiculo{
    private Boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco){

        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Vehiculo.camionetas++;
    }

    public Boolean isVolco(){return this.volco;}
    public void setVolco(Boolean volco){this.volco = volco;}
}
