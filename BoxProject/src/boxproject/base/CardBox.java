/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject.base;



import java.awt.List;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class CardBox {

	protected float width, height, length,basicPrice, oneColorAdditional, twoColorsAdditional, 
                        reinforecedBottomAdditional, reinforecedCornersAdditional, sealableTopAdditional;
	protected int colourTints, grade;
	protected boolean sealableTop, hasReinforcedBottom, hasReinforcedCorners;
        protected float[] prices;
        
        /**
        * Constructor for the abstract class CardBox.
        * The purpose of having this abstract class is to have all mutual methods
        * for the subclasses and force them to implement some unique once.
        *
        * @param  width - float between 0.2 and 3 otherwise not accepted in the UI.
        * @param  height - float between 0.2 and 3 otherwise not accepted in the UI.
        * @param  length- float between 0.2 and 3 otherwise not accepted in the UI.
        * @param  sealableTop - boolean true or false changes the price if positive
        * @param  tints - integer number of colored prints (depends on the box type)
        * @param  hasReinforcedBottom - boolean whether the box has reinforced bottom or not (depends on the type)
        * @param  hasReinforcedCorners - boolean whether the box has reinforced corners or not (depends on the type)
        * @param  grade  - integer number associated with the grade of the box (depends on the type)
        */
	public CardBox(float width, float height, float length, boolean sealableTop, int tints, boolean hasReinforcedBottom,
			boolean hasReinforcedCorners, int grade) {
                this.prices = new float[]{0.5f,0.6f,0.72f, 0.90f, 1.4f};
                oneColorAdditional = 0.13f;
                twoColorsAdditional = 0.16f;
                reinforecedBottomAdditional = 0.14f;
                reinforecedCornersAdditional = 0.10f;
                sealableTopAdditional = 0.8f;
		this.width = width;
		this.height = height;
		this.length = length;
		this.sealableTop = sealableTop;
		this.colourTints = tints;
		this.hasReinforcedBottom = hasReinforcedBottom;
		this.hasReinforcedCorners = hasReinforcedCorners;
                this.grade = grade;
	}
        /**
        * Abstract method for the box name.
        * This method is used for the UI to visualize the Box name. 
        *
        * @return   the box name
        */
	public abstract String getName();
        /**
        * Abstract method for the box price.
        * This method determines the price based on multiple factors.
        * Differs in most of the Boxes.
        *
        * @return      the box price
        */
	public abstract BigDecimal getPrice();
        /**
        * Method for the box area.
        * This method determines the area of 
        * the box based on the math formula.
        *
        * @return      the area of the box
        */
        public float getArea(){
		return 2*(width*height  + width*length + height*length);
	}
        /**
        * Method for the box grade.
        *
        * @return      the grade of the box
        */
        public int getGrade(){
            return grade;
        }
        /**
        * Method for the box width.
        *
        * @return      the width of the box
        */
	public float getWidth() {
		return width;
	}
        /**
        * Method to set the box width to a new one.
        * 
        * @param width the new width
        */
	public void setWidth(float width) {
		this.width = width;
	}
        /**
        * Method for the box height.
        *
        * @return      the height of the box
        */
	public float getHeight() {
		return height;
	}
        /**
        * Method to set the box height to a new one.
        * 
        * @param height the new height
        */
	public void setHeight(float height) {
		this.height = height;
	}
        /**
        * Method for the box length.
        *
        * @return      the length of the box
        */
	public float getLength() {
		return length;
	}
        /**
        * Method to set the box length to a new one.
        * 
        * @param length the new height
        */
	public void setLength(float length) {
		this.length = length;
	}
        /**
        * Method which return whether or not the top of
        * the box is sealed.
        *
        * @return    boolean  - true or false
        */
	public boolean isSealableTop() {
		return sealableTop;
	}
        /**
        * Method to set the box is sealed or not.
        * 
        * @param sealableTop boolean true for sealed
        */
	public void setSealableTop(boolean sealableTop) {
		this.sealableTop = sealableTop;
	}
        /**
        * Method for the number of colored prints.
        *
        * @return      integer the number of colored sides of the box (0 - 2)
        */
	public int getColourTints() {
		return colourTints;
	}
        /**
        * Method to set new number of colored sides.
        *
        * @param  colourTints - integer the number of colored sides of the box (0 - 2)
        */
	public void setColourTints(int colourTints) {
		this.colourTints = colourTints;
	}
 
        /**
        * Method which return whether or not the bottom of
        * the box is reinforced.
        *
        * @return    boolean  - true or false
        */
	public boolean isHasReinforcedBottom() {
		return hasReinforcedBottom;
	}

        /**
        * Method to set the box has reinforced bottom or not.
        * 
        * @param hasReinforcedBottom boolean true for reinforced
        */
	public void setHasReinforcedBottom(boolean hasReinforcedBottom) {
		this.hasReinforcedBottom = hasReinforcedBottom;
	}
   
        /**
        * Method which return whether or not the corners of
        * the box are reinforced.
        *
        * @return    boolean  - true or false
        */
	public boolean isHasReinforcedCorners() {
		return hasReinforcedCorners;
	}

        /**
        * Method to set the box has reinforced corners or not.
        * 
        * @param hasReinforcedCorners boolean true for reinforced
        */
	public void setHasReinforcedCorners(boolean hasReinforcedCorners) {
		this.hasReinforcedCorners = hasReinforcedCorners;
	}

}
