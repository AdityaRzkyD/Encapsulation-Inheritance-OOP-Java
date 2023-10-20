public class Matematika{
    int hasil;

    void pertambahan(int a, int b){
        hasil = a+b;
        System.out.println("Pertambahan : "+a+" + "+b+" = "+hasil);
    }

    void pengurangan(int a, int b){
        hasil = a-b;
        System.out.println("Pengurangan : "+a+" - "+b+" = "+hasil);
    }

    void perkalian(int a, int b){
        hasil = a*b;
        System.out.println("Perkalian : "+a+" * "+b+" = "+hasil);
    }

    void pembagian(int a, int b){
        hasil = a/b;
        System.out.println("Pembagian : "+a+" / "+b+" = "+hasil);
    }
}