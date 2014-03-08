/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vector;

import javax.swing.*;
public class Vector {

    
    public static void main(String[] args) {
        
        	int vec[];
    	vec=new int[5];
    	int dato,i;

        for (i=0; i<=4; i++){
        	dato = Integer.parseInt(JOptionPane.showInputDialog(" Digite el dato de la posición"));
        	if (dato>8){
       				 vec[i]=dato;
        		   	 System.out.print(dato + " ");
    }else
    	System.out.print( " Dato Menor " );
    	
        //toes men
    }
    
  }
}
