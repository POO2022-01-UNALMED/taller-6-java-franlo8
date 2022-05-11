package vehiculos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        Cuarto owo = new Cuarto();
    }
}

class Primero{
    Primero(){
        m();
    }
    void m(){
        System.out.println("m desde Primero");
    }
}
class Cuarto extends Primero{
    void m() {
        System.out.println("m desde Cuarto");
    }
}
