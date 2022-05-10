package Vehiculos;

public class Automovil {
   int puestos;
   public static int puertas= 4;
   public static int velocidadMaxima = 100;
   public static String traccion = "FWD";
}

public class Vehiculo {
    private String placa;
    private int velocidadMaxima;
    private int puertas;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private int CantidadVehiculos;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }
}
    public class Pais {
       private String nombre;
}

public class Fabricante {
     private String nombre;
     private Pais pais;
}

public class Camion extends Vehiculo {
     private int ejes;
     public static int puertas = 2;
     public static int velocidadMaxima = 80;
     public static String traccion = "4X2";
}

public class Camioneta extends Vehiculo {
       private boolean volco;
       public static int velocidadMaxima = 90;
       public static String traccion = "4X4";

}
