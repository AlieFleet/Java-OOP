package Classes;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
class Warna {
    void apa() {
        System.out.println("sila pilih color");
    }
}

class Car {
    private Engine ejin;   // Car HAS-A Engine
    private Warna wana;

    public Car() {
        ejin = new Engine();
        wana = new Warna();
    }

    void startCar() {
        ejin.start();
    }
    void Warna(){
        System.out.println("biru");
        wana.apa();
    }
}

