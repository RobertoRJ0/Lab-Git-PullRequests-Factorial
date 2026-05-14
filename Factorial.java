public class Factorial {
    public static long calcular(int n) {
        // Caso base: el factorial de 0 es 1
        if (n == 0) return 1;
        
        long resultado = 1;
        // Cambiamos "i < n" por "i <= n"
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}