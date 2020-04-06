public abstract class Operacoes {
    public static double media(int[] valores) {

        double soma = 0;
        for (int n : valores) {
            soma += n;
        }

        return soma / valores.length;
    }

    public static int impares(int[] valores) {
        int cont = 0;
        for (int n : valores) {
            if (n % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }

    public static void imprimirValores(int[] valores) {
        for (int n : valores) {
            System.out.println(n);
        }
    }
}
