/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

/**
 *
 * @author ivanlebanov
 */
public class BoxProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] colours1 = new String[0];
        Box type1 = new Box(1, colours1, false , false , false);
        
        
        System.out.println(type1.boxType());
       
        
        
    }
    
}
