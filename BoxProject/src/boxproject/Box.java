/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import java.util.ArrayList;

/**
 *
 * @author ivanlebanov
 */
public class Box {
    protected int boxGrade,boxType, boxColours;
    
    protected boolean hasReinforcedBottom,hasReinforcedCorners,hasselableTop,validBox;   

    public Box(){
        
    }
    
    /**
    * Box constructor a parent class for all other Boxes. 
    * @param  grade   must specify the grade of the box.
    * @param  colours an array of colors.
    * @param  reinforcedBottom whether the box has reinforced bottom
    * @param  reinforcedCorners whether the box has reinforced corners
    * @param  selableTop whether the box is can be sealed 
    */
    public Box(int grade, String colours[], boolean reinforcedBottom,boolean reinforcedCorners,boolean selableTop){
        boxGrade = grade;
        boxColours = colours.length;
        hasReinforcedBottom = reinforcedBottom;
        hasReinforcedCorners = reinforcedCorners;
        hasselableTop = selableTop;
        boxType = boxType();

    }
   
    /**
     * Sets a new box grade.
     * @return boxGrade - the box grade
     */   
    public int getBoxGrade(){
        return boxGrade;
    }

    /**
    * Sets a new box grade
    *
    * @param newBoxGrade  the new boxGrade
    */
    public void setBoxGrade(int newBoxGrade){
        boxGrade = newBoxGrade;
    }
    
    public int boxType(){
        if(boxGrade >=  1 && boxGrade <= 3 && boxColours == 0 && !hasReinforcedBottom &&  !hasReinforcedCorners){
            return 1;
        }else if(boxGrade >=  2 && boxGrade <= 4 && boxColours == 1 && !hasReinforcedBottom &&  !hasReinforcedCorners){
            return 2;
        }else if(boxGrade >=  2 && boxGrade <= 5 && boxColours == 2 && !hasReinforcedBottom &&  !hasReinforcedCorners){
            return 3;
        }else if(boxGrade >=  2 && boxGrade <= 5 && boxColours == 2 && hasReinforcedBottom &&  !hasReinforcedCorners){
            return 4;
        }else if(boxGrade >=  3 && boxGrade <= 5 && boxColours == 2 && hasReinforcedBottom &&  hasReinforcedCorners){
            return 5;
        }
        return 0;
    } 
    
    

}
