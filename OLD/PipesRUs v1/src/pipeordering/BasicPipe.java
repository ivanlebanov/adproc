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
 * Used for pipes of type 1-3
 */
public class BasicPipe extends Pipe {
    DecimalFormat dp = new DecimalFormat("#.##");
    public BasicPipe(){
        
    }
    
    
    public BasicPipe(int grade,int colours,boolean chem){
        super(grade,colours,chem);
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
        double totalCost =1;
        
        if(numColours ==1){totalCost=totalCost+0.12;}
        else if(numColours==2){totalCost=totalCost+0.17;}
        
        if(chemicalResis==true){totalCost=totalCost+0.12;}
       
        String tdp =dp.format(totalCost);
        totalCost=Double.valueOf(tdp);
        
        return totalCost;
    }
    
}

