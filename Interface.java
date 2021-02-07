/******************************************************************

@author Jose Miguel Gonzalez
interface calculadora
******************************************************************/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;
/**
*Nos da los parametros para poder usarlos de forma correcta el la clase de "calculadora" con sus parametros y retornos.
*Interfaz que sera implementa en Calculadora
*/

public interface Interface{
    // x el primer numero / y el segundo
    public int resta(int x, int y);// x el primer numero / y el segundo
    public int multiplicacion(int x, int y);// x el primer numero / y el segundo
    public int division(int x, int y);// x el primer numero / y el segundo
    public int operar(stack x); //toma los datos para calcularlos
    public String decode(String a);//toma un archivo y saca las diferentes partes
}