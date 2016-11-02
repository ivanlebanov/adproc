/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeordering;

import java.text.DecimalFormat;

/**
 *
 * 
 * Used for pipes of type 5
 */
public class SuperPipe extends Pipe {
    
    
    public SuperPipe(){
        
    }
    DecimalFormat dp = new DecimalFormat("#.##");
    
    public SuperPipe(int grade,int colours,boolean insulated, boolean reinforced, boolean chem){
        super(grade,colours,insulated,reinforced,chem);
    }
    
    public boolean isChemicalResistant(){
        return(chemicalResis);
    }
    
    public boolean isReinforced(){
    return(isReinforced);    
    }
     
    public boolean isInsulated(){
        return(isInsulated);
    }
    
    public double costMultiplier(){
        double totalCost =1.29;
        
        if(numColours ==1){totalCost=totalCost+0.12;}
        else if(numColours==2){totalCost=totalCost+0.17;}
        
        if(chemicalResis==true){totalCost=totalCost+0.12;}
        
        String tdp =dp.format(totalCost);
        totalCost=Double.valueOf(tdp);
        return totalCost;
    }
}