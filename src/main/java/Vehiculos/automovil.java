package Vehiculos;

public class Automovil extends Vehiculo{
   int puestos;
   public static int puertas= 4;
   public static int velocidadMaxima = 100;
   public static String traccion = "FWD";

    public Automovil (String placa, int velocidadMaxima, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
       super(placa, velocidadMaxima:100, puertas:4, nombre, precio, peso, traccion:"FWD", fabricante);
       this.puestos= puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
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
    public static int CantidadVehiculos;

    public Vehiculo (String placa, int velocidadMaxima, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa=placa;
        this.velocidadMaxima=velocidadMaxima;
        this.puertas=puertas;
        this.nombre= nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
    }

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

       public Pais (String nombre) {
           this.nombre
       }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

public class Fabricante {
     private String nombre;
     private Pais pais;

     public Fabricante (String nombre, Pais pais) {
         this.nombre = nombre;
         this.pais =pais;

     }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

public class Camion extends Vehiculo {
     private int ejes;
     public static int puertas = 2;
     public static int velocidadMaxima = 80;
     public static String traccion = "4X2";

    public Camion  (String placa, int velocidadMaxima, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
        super(placa, velocidadMaxima:80, puertas:2, nombre, precio, peso, traccion:"4X2", fabricante);
        this.ejes= ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}

public class Camioneta extends Vehiculo {
       private boolean volco;
       public static int velocidadMaxima = 90;
       public static String traccion = "4X4";

    public Camioneta  (String placa, int velocidadMaxima, int puertas, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
        super(placa, velocidadMaxima:80, puertas:2, nombre, precio, peso, traccion:"4X2", fabricante);
        this.volco= volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }
}


