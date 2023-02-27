public class Tipos_variaveis {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean resultado= a==b?true:false;
        System.out.println(resultado);
        if (a || b) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}