/*
 * Clase que calcula el valor 1 multiplicado por la variable i
 */
package factorial;

/**
 *
 * @author ablancoabalde
 */
public class Calculo {

    /**
     * Metodo que realiza el calculo
     */
    public int CalcNumero(int valorInicial) {
        int numero;
        int i;

        if (valorInicial==0) {
            numero=1;
        } else {
            numero=1;
            for (i=valorInicial; i>=1; i--) {
                numero=numero*i;
            }
        }
        return numero;
    }

}
