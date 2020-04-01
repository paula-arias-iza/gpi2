package es.unavarra.gpi2;


import org.junit.Test;
import java.util.Scanner;
/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @Test
    public void stringTest(){
        String stringFijo = "hola";
        System.out.println ("Escribe un mensaje:");
        String string;
        Scanner entradaEscaner = new Scanner (System.in);
        string = entradaEscaner.nextLine ();
        System.out.println("prueba");
        assert string.equals(stringFijo);
    }
}
