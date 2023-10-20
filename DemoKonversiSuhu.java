public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2();

        suhu.celciusToFahrenheit(30);
        System.out.println("Konversi "+suhu.C+" Celcius ke Fahrenheit: "+suhu.GetKonversi());
        suhu.celciusToReamur(40);
        System.out.println("Konversi "+suhu.C+" Celcius ke Reamur: "+suhu.GetKonversi());
        suhu.fahrenheitToReamur(30);
        System.out.println("Konversi "+suhu.F+" Fahrenheit ke Reamur: "+suhu.GetHasil());
    }
}
