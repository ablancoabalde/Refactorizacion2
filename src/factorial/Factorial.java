package factorial;

/**
 * Ejercicio2: Refactorización y JavaDOC
 *
 * @author ablancoabalde
 */
public class Factorial {

    public static void main(String[] args) {
        /**
         * Instancio una variable de la clase Calculos, para hacer la llamada a
         * los metodos
         */
        Calculo calc=new Calculo();
        /**
         * Muestro por pantalla el resultado del calculo
         */
        System.out.println(calc.CalcNumero(8));

    }

}
