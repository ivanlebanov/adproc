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
import boxproject.base.CardBox;

public class BoxFactory {

    public static CardBox getBox(float width, float height, float length, boolean sealableTop, int tints, boolean hasReinforcedBottom,
                    boolean hasReinforcedCorners , int grade){

        if(tints == 0 && !hasReinforcedBottom && !hasReinforcedCorners && grade <= 3 && grade >= 1){
            // type 1 ....
            return new BoxTypeOne(width,height,length,sealableTop, grade);
        } else if (tints == 1 && !hasReinforcedBottom && !hasReinforcedCorners && grade <= 4 && grade >= 2){
            // type 2 ....
            return new BoxTypeTwo(width,height,length,sealableTop, grade);
             
        } else if (tints == 2 && !hasReinforcedBottom && !hasReinforcedCorners && grade <= 5 && grade >= 2){
            // type 3 ....
            return new BoxTypeThree(width,height,length,sealableTop, grade);
             
        } else if (tints == 2 &&  hasReinforcedBottom && !hasReinforcedCorners && grade <= 5 && grade >= 2){
            // type 3 ....
            return new BoxTypeFour(width,height,length,sealableTop, grade);
             
        } else if (tints == 2 &&  hasReinforcedBottom && hasReinforcedCorners && grade <= 5 && grade >= 3){
            // type 3 ....
            return new BoxTypeFive(width,height,length,sealableTop, grade);
             
        } else {
            return null;
        }


    }

}
