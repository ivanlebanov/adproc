/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;

import java.math.BigDecimal;
import boxproject.base.CardBox;

public class BoxTypeTwo extends CardBox {
    
    public BoxTypeTwo(float width, float height, float length, boolean sealableTop, int grade) {
            super(width, height, length, sealableTop, 1, false, false, grade);
    }

    @Override
    public BigDecimal getPrice() {
 
        float price = getArea() * prices[grade - 1];
        price +=  price * oneColorAdditional;
        if(this.isSealableTop()){
            price +=  price * sealableTopAdditional;
        }
        
        return new BigDecimal( price );
    }

    @Override
    public  String getName(){
        return "Box Type 2";
    }
}
