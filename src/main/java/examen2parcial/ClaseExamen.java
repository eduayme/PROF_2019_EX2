package examen2parcial;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

    public static class EntradaInvalida extends Exception {
        public EntradaInvalida(String errorMessage) {
            super(errorMessage);
        }
    }

    public static List<Integer> primos( int n ) throws EntradaInvalida {
        List<Integer> primos = new ArrayList <Integer>();

        if( n <= 1 ) {
            throw new EntradaInvalida("El número N tiene que ser mayor a 1" );
        }
        else {
            for( int i = 2; i <= n; i++ )
            {
                while( n%i == 0 )
                {
                    n = n/i;
                    primos.add( i );
                }
            }
        }

        return primos;
    }
}
