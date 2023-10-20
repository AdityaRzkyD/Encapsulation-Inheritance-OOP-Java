public class KonversiSuhu {
    private double Konversi;
    double C;
    
    void celciusToFahrenheit(double c){
        Konversi = (1.8*C)+32;
        C = c;
    }

    void celciusToReamur(double c){
        Konversi = 0.8*C;
        C = c;
    }

    double GetKonversi(){
        return Konversi;
    }

}
