/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Danirx
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es fin de semana da igual cuantas bellotas haya     
        if (finDeSemana){
        return true;
        }
        //si llega aqui es que no es fin de semana
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
    
/**
 * 
 * multa
 */    
    
    public int multa (int velocidad, boolean birthday){
        
        if(birthday){
        velocidad = velocidad - 5; //velocidad -= 5; esto es ponerlo pro
        }
        //si va a menos de 60 por hora
        if (velocidad <= 60){
            return 0;
        }
        //si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80){
            return 1; //multa pequeña
        }
        //en cualquier otro valor que tuviera velocidad devolvemos la multa grande
        return 2;
        
    }
    
    /**
     *  
     * @param numero el numeroa evaluar si es o no vanidoso. Es vanidoso si
     * es múltiplo de 11 o uno más del múltiplo de 11     * 
     */
    public boolean muyVanidoso(int numero){
        if(numero % 11 < 2){ //si la división da como resto cero o uno
            return true;
        }
        return false;
                
        
        
    }
    
    public boolean contesta (boolean matinal, boolean madre, boolean dormido){
    
        if (dormido == true){
        return false;
        }
        if (matinal == true && madre == false){
        return false;
        }
        return true;
    
    }
    
    public boolean menorPor (int a, int b, int c){
        
        if (a-b == 10 || a-c == 10 || b-c ==10){
            return true;
        }
        
        if (b-a == 10 || c-a == 10 || c-b ==10){
            return true;
        }
        return false;
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        System.out.println("ejercicio 01 ardillas:");
        ejercicio.fiestaArdillas(0, true);
        System.out.println( ejercicio.fiestaArdillas(30, false) );
        System.out.println( ejercicio.fiestaArdillas(50, false) );
        System.out.println( ejercicio.fiestaArdillas(70, true) );
        
        System.out.println("ejercicio 02 multa:");
        System.out.println( ejercicio.multa(60, false) );
        System.out.println( ejercicio.multa(65, false) );
        System.out.println( ejercicio.multa(65, true) );
        
        
        System.out.println("ejercicio 03 muy Vanidoso:");
        System.out.println( ejercicio.muyVanidoso(22) );
        System.out.println( ejercicio.muyVanidoso(23) );
        System.out.println( ejercicio.muyVanidoso(24) );
        
        System.out.println("ejercicio 04 contesta:");
        System.out.println( ejercicio.contesta(false, false, false) );
        System.out.println( ejercicio.contesta(false, false, true) );
        System.out.println( ejercicio.contesta(true, false, false) );
        
        
        System.out.println("ejercicio 05 menorPor:");
        System.out.println( ejercicio.menorPor (1, 7, 11) );
        System.out.println( ejercicio.menorPor (1, 7, 10) );
        System.out.println( ejercicio.menorPor (11, 1, 7) );
        
    }
    
}
