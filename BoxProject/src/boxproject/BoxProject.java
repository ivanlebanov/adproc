/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject;
import java.awt.List;
import java.math.BigDecimal;
import java.util.ArrayList;

import boxproject.base.CardBox;
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
        
		ArrayList<CardBox> orderList = new ArrayList<CardBox>();
		
		CardBox box = BoxFactory.getBox(12.0f,12.0f,12.5f,true,0,false,false, 1);// UI based selection, pass params to Factory it will return concrete impl
                CardBox box2 = BoxFactory.getBox(12.0f,12.0f,12.5f,true,1,false,false, 2);
                CardBox box3 = BoxFactory.getBox(12.0f,12.0f,12.5f,true,2,false,false, 5);
                CardBox box4 = BoxFactory.getBox(12.0f,12.0f,12.5f,true,2,true,false, 5);
                CardBox box5 = BoxFactory.getBox(12.0f,12.0f,12.5f,true,2,true,true, 4);
                orderList.add(box);
		orderList.add(box2);
                orderList.add(box3);
                orderList.add(box4);
		orderList.add(box5);
                
		BigDecimal total = new BigDecimal(0);
		
		for(CardBox currentBox : orderList){
                    System.out.println(currentBox.getPrice().toPlainString());
                    total = total.add(currentBox.getPrice());
		}
                
                System.out.println(total);
       
        
        
    }
    
}
