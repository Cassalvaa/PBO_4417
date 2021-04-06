
public class TestKendaraan {
    public static void main(String[] args) {
        ClsKendaraan kendaraan = new ClsKendaraan();
        ElSepeda Sepeda = new ElSepeda();
        Pmotor motor = new Pmotor(3, "H 171 NO");
    

        Sepeda.MauLurus();
        Sepeda.BellBunyikan();
        motor.Coba();
        kendaraan.MauKekanan();
        motor.DptMesin();
    }
}
