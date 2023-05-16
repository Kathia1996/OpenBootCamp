
public class Main {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        suma(numero1,numero2,numero3);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("Numero de puertas: " + miCoche.numpuertas);
    }
    public static void suma(int a, int b, int c){
        int suma = a+b+c;
        System.out.println("Suma: "+ suma);
    }
}

class Coche {
    public int numpuertas= 2;

    public void IncrementarPuertas(){
        this.numpuertas++;
    }
}