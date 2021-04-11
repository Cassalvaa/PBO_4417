public class MotorCycle extends MotorVehicle {
    int numGear = 0;

    MotorCycle() {
    
    }

    void goStraight() {
        System.out.println("Motor maju..");
    }

    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }

    public int getGearFoot(){
        return numGear;
    }

}