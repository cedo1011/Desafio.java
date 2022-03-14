public class Desafio {
    private static boolean analise(int num){
        return num % 2 != 0;
    }

    private static String resposta(boolean res) {
        return (res) ? "Número Par" : "Número Impar";
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(resposta(analise(num)));
    }
}

