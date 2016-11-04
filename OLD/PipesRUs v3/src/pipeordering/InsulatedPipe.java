/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeordering;

import java.text.DecimalFormat;

/**
 *
 * @author Josh
 */
public class InsulatedPipe extends Pipe {
      DecimalFormat dp = new DecimalFormat("#.##");
    public InsulatedPipe(){
        
    }
    
    
    public InsulatedPipe(int grade,int colours,boolean insulated, boolean chem){
        super(grade,colours,insulated,chem);
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
        double totalCost =1.31;
                        
        if(chemicalResis==true){totalCost=totalCost+0.12;}
        
        String tdp =dp.format(totalCost);
        totalCost=Double.valueOf(tdp);
        return totalCost;
    }
    
}