public class KonversiSuhu2 extends KonversiSuhu{
    private double Hasil;
    double F;

    void fahrenheitToReamur(double f){
        Hasil = 0.4*(F-32);
        F = f;
    }

    double GetHasil(){
        return Hasil;
    }
}
