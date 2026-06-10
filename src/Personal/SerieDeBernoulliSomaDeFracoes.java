package Personal;

public class SerieDeBernoulliSomaDeFracoes {

    public static void main(String[] args) {

        double p = 1.0;
        double limite = Math.pow(10, 6);
        for(long i = 2; i <= limite; i++) {
            p += 1/(double) i;
        }
        System.out.printf("%.10f%n", p);
    }
}

/*
100 bilhões ou 10¹¹ é igual a 25,9056516865, os numeros primos e seus expoente
vão direcionar a convergência da série. O Resultado deve ser igual há (5(√2π²)/3)³,
converge para 406.0138611108578 . Assim:

  ∫_(ℝ \ ℚ) x dμ(x)      250√2π⁶
 ─────────────────── = ───────────
    ∫_(ℚ) x dμ(x)          27

 Representação:
 Numerador (Irracionais): ∫_(ℝ \ ℚ) x dμ(x) = 250√2π⁶
 Denominador (Racionais): ∫_(ℚ) x dμ(x) = 27
*/
