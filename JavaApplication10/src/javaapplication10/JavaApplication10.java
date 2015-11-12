
package javaapplication10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaApplication10 {

    
    public static void main(String[] args) throws IOException {
        
        String dni="";
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        do{
        //pido nº de DNI
        System.out.println("Introduzca su número de DNI: ");
        //voy a leer ese número
        dni=teclado.readLine();
        }
        while(dni.equals(""));
        //le pido que me pase ese número a entero
        int num=Integer.parseInt(dni);
        System.out.println();
        //hacemos la operación que hemos comentado
        int digito=(num-(((num/23))*23));
        String resultado="";
        switch(digito){
            case 0: resultado="I";
                break;
            case 1: resultado="R";
                break;
            case 2: resultado="W";
                break;
            case 3: resultado="A";
                break;
            case 4: resultado="G";
                break;
            case 5: resultado="M";
                break;
            case 6: resultado="Y";
                break;
            case 7: resultado="F";
                break;
            case 8: resultado="P";
                break;
            case 9: resultado="D";
                break;
            case 10: resultado="X";
                break;
            case 11: resultado="B";
                break;
            case 12: resultado="N";
                break;
            case 13: resultado="J";
                break;    
            case 14: resultado="Z";
                break;    
            case 15: resultado="S";
                break;
            case 16: resultado="Q";
                break;    
            case 17: resultado="V";
                break;    
            case 18: resultado="H";
                break; 
            case 19: resultado="L";
                break;    
            case 20: resultado="C";
                break;  
            case 21: resultado="K";
                break;       
            case 22: resultado="E";
                break;                 
            case 23: resultado="T";
                break;    
                
            default:
                resultado="sin valor";
        
    }
        System.out.println("La letra asociada al num. "+num+ "es"+resultado);
        
    }
    
}
