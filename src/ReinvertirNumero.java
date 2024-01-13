public class ReinvertirNumero {
    public static void main(String[] args) {
        int numero=1234567;
        int numeroInvertido=invertirNumero(numero);
        System.out.println("Numero reinvertido: "+numeroInvertido);
    }
    static int invertirNumero(int num){
        int invertido=0;

        while (num!=0) {
            int digito=num%10;
            invertido=invertido*10+digito;
            num/=10;
        }
        return invertido;
    }
}
