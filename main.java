/******************************************************************

@author Jose Miguel Gonzalez
main/controlador
******************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;

public class main{
    /**
*Este es el lugar desde donde se ejecutara todo el programa.
*
*/
    public static void main(String [] args){

        //Calculadora cal = new Calculadora();
        //Calculadora cal = new Calculadora();
        //calculadora cal = new calculadora();
        Operaciones cal = new Operaciones();

        //String a = archivo.leerTxt("C:\\Users\\josem\\OneDrive\\Escritorio\\Calculadora\\datos.txt");
        String a = cal.decode("C:\\Users\\josem\\OneDrive\\Escritorio\\Calculadora\\datos.txt");

        System.out.println(a);

    }
}