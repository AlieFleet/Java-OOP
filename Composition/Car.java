package Composition;

class Engine {
    void start() {
        System.out.println("Engine started");
    }

    double power(String model) {
        // compare strings with equals and provide a default return value
        if("RS".equalsIgnoreCase(model)){
            return 1.5;
        }
        else if("TypeR".equalsIgnoreCase(model)){
            return 2.0;
        }
        return 1.5;
    }
}

class Warna {
    void apa() {
        System.out.println("sila pilih color");
    }
}

class Car {
    private Engine ejin; // Car HAS-A Engine
    private Engine hp;
    private Warna wana;

    public Car() {
        ejin = new Engine();
        wana = new Warna();
        hp = new Engine();
    }

    void startCar() {
        ejin.start();
    }

    void hoursePower(String m){
        //when calling for method, dont include the type
        System.out.println("The model hp is: " + hp.power(m));
    }

    void Warna() {
        System.out.println("biru");
        wana.apa();
    }
}
