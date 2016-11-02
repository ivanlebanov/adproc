/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipeordering;


/**
 *
 */
public abstract class Pipe {
   protected int pipeGrade,numColours,pipeType;
   protected boolean isInsulated,isReinforced,chemicalResis,validPipe;    
   
    

public Pipe(){
    
}

public Pipe(int grade, int colours, boolean insulated,boolean reinforced,boolean chemical){
        pipeGrade = grade;
        numColours = colours;
        isInsulated = insulated;
        isReinforced = reinforced;
        chemicalResis = chemical;
        
        pipeType = pipeType();

    }

public Pipe(int grade, int colours, boolean insulated,boolean chemical){
        pipeGrade = grade;
        numColours = colours;
        isInsulated = insulated;
        isReinforced = false;
        chemicalResis = chemical;
        
        pipeType = pipeType();

    }


public Pipe(int grade, int colours,boolean chemical){
        pipeGrade = grade;
        numColours = colours;
        isInsulated = false;
        isReinforced = false;
        chemicalResis = chemical;
        
        pipeType = pipeType();

}


    public abstract boolean isChemicalResistant();
    
    public abstract boolean isReinforced();
     
    public abstract boolean isInsulated();
   
    public abstract double costMultiplier();
    
    public int totalColours(){
        return (this.numColours);
    }
   
       
    public int pipeType(){
       
        if(isReinforced == true){
            validPipe=checkPipeGradeV();
            if (validPipe==true){
                return(5);
            }
        }
        else if(isInsulated == true){
            validPipe =checkPipeGradeIV();
            if (validPipe==true){
                return(4);
            }
        }
        else if(numColours==2){
            validPipe=checkPipeGradeIII();
            if (validPipe==true){
                return(3);
            }
        }
        else if(numColours==1){
            validPipe = checkPipeGradeII();
            if (validPipe==true){
                return(2);
            }
        }
        else if(numColours==0){
            validPipe = checkPipeGradeI();
            if (validPipe==true){
                return(1);
            }
        }
        return(0);
    }
    
    public boolean checkPipeGradeV(){
        if(pipeGrade<=2 || numColours <2 || isInsulated ==false){
               return(false);
           }
        else{return(true); }
        
    }
    
    public boolean checkPipeGradeIV(){
        if(pipeGrade==1 || numColours <2 || isReinforced ==true){
               return(false);
           }
        else{return(true); }
        
    }
    
    public boolean checkPipeGradeIII(){
        if(pipeGrade==1 || numColours <2 || isReinforced ==true || isInsulated==true){
               return(false);
           }
        else{return(true); }
        
    }
    
    public boolean checkPipeGradeII(){
        if((pipeGrade==2 || pipeGrade ==5) || numColours !=1 || isReinforced ==true || isInsulated==true){
               return(false);
           }
        else{return(true); }
        
    }
    
    public boolean checkPipeGradeI(){
        if(pipeGrade>=4 || numColours !=0 || isReinforced ==true || isInsulated==true){
               return(false);
           }
        else{return(true); }
        
    }
}