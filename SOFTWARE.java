/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Scanner;

/**
 *
 * @author JESSI
 */
public class SOFTWARE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SOFTWARE obj=new SOFTWARE();
      obj.Calcular();
        
    }
    
    
public void Calcular(){
        
  double x1;
  double y1;
  double x2;
  double y2;
  double distancia;

 Scanner entrada = new Scanner(System.in);
  
 System.out.println("\nPor favor introduzca la coordenada x del primer punto: ");
 x1 = entrada.nextDouble();
   
 System.out.println("\nPor favor introduzca la coordenada y del primer punto: ");
 y1 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada x del segundo punto: ");
 x2 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada y del segundo punto: ");
 y2 = entrada.nextDouble();

 distancia = Math.sqrt( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) );

 System.out.printf("\nLa distancia entre los puntos es: %.2f\n", distancia);
        
    }
    
}
