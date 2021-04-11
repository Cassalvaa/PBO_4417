public class UjiKendaraan {
    static void KendaraanMelaju(Vehicle vehicle) {
        vehicle.goStraight();
    }

    public static void main(String[] args) {
        Car mobil = new Car();
        MotorCycle motor = new MotorCycle();
        Bicycle sepeda = new Bicycle();

        // mobil
        mobil.setSeatBelt(1);
        System.out.println(mobil.getSeatBelt());
        KendaraanMelaju(mobil);
        
        // motor
        motor.setGearFoot(1);
        System.out.println(motor.getGearFoot());
        KendaraanMelaju(motor);
        
        // sepeda
        sepeda.ringBell();
        KendaraanMelaju(sepeda);
    }
}