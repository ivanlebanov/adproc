/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeordering;

import java.text.DecimalFormat;


 

/**
 *
 */
public class CustomerOrder {
  private double pipeLength,radius,diameter,innerDiam,innerRadius,total,multiplier=1;
  private int numOfColours,plasticGrade,type;
  private boolean isDiameter,isInsulated,needsChemResistance,needsReinforcement;
  
  
  DecimalFormat dp = new DecimalFormat("#.##");
    
    
    
    public CustomerOrder(double length,boolean isDiameter,double outerMeasure,int colours
                        ,boolean insulated,boolean isReinforce,boolean isChemResis,int grade){
        
        
        pipeLength = length*39.37;
        
        if (isDiameter == true){
            diameter= outerMeasure;
            innerDiam = 0.9*diameter;
            radius = 0.5*diameter;
         }
        else {
            radius = outerMeasure;
            innerRadius = 0.9*radius;
            diameter = 2*radius;
        }
        
        numOfColours = colours;
        plasticGrade = grade;
        needsChemResistance = isChemResis;
        needsReinforcement = isReinforce;
        isInsulated = insulated;
        
             
       
    }
    
    public int createPipe(){
        
        
        BasicPipe pipeCreationBasic = new BasicPipe(plasticGrade,numOfColours,needsChemResistance);
        InsulatedPipe pipeCreationInsulated = new InsulatedPipe(plasticGrade,numOfColours,isInsulated,needsChemResistance);
        SuperPipe pipeCreationSuper = new SuperPipe(plasticGrade,numOfColours,isInsulated,needsReinforcement,needsChemResistance);
        

        /**Creates a superPipe then checks its attributes and then creates a specific
        pipe based of the features.
        */
        Pipe returnPipe;
        SuperPipe testPipe = new SuperPipe(plasticGrade,numOfColours,isInsulated,needsReinforcement,needsChemResistance); 
        
        int pipeType = testPipe.pipeType();
        returnPipe = testPipe;
        
        if(pipeType >0 && pipeType < 4){returnPipe = pipeCreationBasic;}
        else if(pipeType==4){returnPipe = pipeCreationInsulated;}
        else if(pipeType==5){returnPipe = pipeCreationSuper;}
        
        multiplier = returnPipe.costMultiplier();
        
        return(returnPipe.pipeType());
    
    }
    
    //checks if the calculated pipe type is valid.
    public boolean checkPipe(){
        
        type = selectPipe();
        switch (type) {
            case 0: type=0;
                    break;
            case 1: type=1;
                    break;
            case 2: type=2;
                    break;
            case 3: type=3;
                    break;
            case 4: type=4;
                    break;
            case 5: type=5;
                    break;
            default: break;
        }
        if (type==0){
            return(false);
        }
        else{ return(true);
        }
    }
    
    public int selectPipe(){
        return(createPipe());
        
    }


    public double pipeCost(){
    
        return (multiplier);
    }
    
    public double returnRadius(){
        return radius;
    }
    
    
    /**
     * 
     * Calculates the volume of the pipe and returns base cost+ additional costs 
     */
    public double calcAmount(){
        double areaInner = Math.PI*(innerRadius*innerRadius);
        double allArea = Math.PI*(radius*radius);
        double area = allArea-areaInner;
        double volume = (area)*pipeLength;
        double volumeCost=0;
        type = selectPipe();
        
        if(type==1){volumeCost=0.3;}
        else if(type==2){volumeCost=0.32;}
        else if(type==3){volumeCost=0.35;}
        else if(type==4){volumeCost=0.40;}
        else if(type==5){volumeCost=0.46;}
        
        total = multiplier*volume*(volumeCost);
        
        String tdp =dp.format(total/100);
        total=Double.valueOf(tdp);
        return total;
    }
    
   
   
}