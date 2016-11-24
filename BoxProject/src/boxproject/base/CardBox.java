/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxproject.base;

/**
 *
 * @author ivanlebanov
 */

import java.awt.List;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class CardBox {

	protected float width, height, length,basicPrice, oneColorAdditional, twoColorsAdditional, 
                        reinforecedBottomAdditional, reinforecedCornersAdditional, sealableTopAdditional;
	protected int colourTints, grade;
	protected boolean sealableTop, hasReinforcedBottom, hasReinforcedCorners;
        protected float[] prices;
        
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
	
	public abstract BigDecimal getPrice();
        public float getArea(){
		return 2*(width*height  + width*length + height*length);
	}
        public int getGrade(){
            return grade;
        }
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public boolean isSealableTop() {
		return sealableTop;
	}

	public void setSealableTop(boolean sealableTop) {
		this.sealableTop = sealableTop;
	}

	public int getColourTints() {
		return colourTints;
	}

	public void setColourTints(int colourTints) {
		this.colourTints = colourTints;
	}

	public boolean isHasReinforcedBottom() {
		return hasReinforcedBottom;
	}

	public void setHasReinforcedBottom(boolean hasReinforcedBottom) {
		this.hasReinforcedBottom = hasReinforcedBottom;
	}

	public boolean isHasReinforcedCorners() {
		return hasReinforcedCorners;
	}

	public void setHasReinforcedCorners(boolean hasReinforcedCorners) {
		this.hasReinforcedCorners = hasReinforcedCorners;
	}

}
