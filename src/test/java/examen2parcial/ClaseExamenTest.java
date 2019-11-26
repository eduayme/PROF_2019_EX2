package examen2parcial;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ClaseExamenTest {

    ClaseExamen clasePrimos = new ClaseExamen();

    @Test(expected = ClaseExamen.EntradaInvalida.class)
    public void exception_with_1() throws ClaseExamen.EntradaInvalida
    {
        int n = 1;

        clasePrimos.primos( n );
    }

    @Test
    public void primos_6_OK() throws ClaseExamen.EntradaInvalida
    {
        int n = 6;
        List <Integer> solution = new ArrayList <Integer>();
        solution.add( 2 );
        solution.add( 3 );

        assertEquals( solution, clasePrimos.primos( n ) );
    }

    @Test
    public void primos_13_OK() throws ClaseExamen.EntradaInvalida
    {
        int n = 13;
        List <Integer> solution = new ArrayList <Integer>();
        solution.add( 13 );

        assertEquals( solution, clasePrimos.primos( n ) );
    }

    @Test
    public void primos_25_OK() throws ClaseExamen.EntradaInvalida
    {
        int n = 25;
        List <Integer> solution = new ArrayList <Integer>();
        solution.add( 5 );
        solution.add( 5 );

        assertEquals( solution, clasePrimos.primos( n ) );
    }
}
