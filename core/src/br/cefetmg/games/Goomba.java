/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
/**
 *
 * @author Sarit
 */
public class Goomba {
    private Texture spriteSheet;
    private int positionX, positionY, height, width;  
    private Animation walkRight, walkLeft, walkUp, walkDown, currentAnimation;
    private boolean walking;   
    
    public Goomba(String texture, int positionX, int positionY, int width, int height) {
        this.spriteSheet = new Texture(texture);
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        //cria animações
        TextureRegion[][] AnimationFrames = TextureRegion.split(spriteSheet, width, height);        
        this.walkDown = new Animation(0.1f, AnimationFrames[0][0], AnimationFrames[0][1], AnimationFrames[0][2], AnimationFrames[0][3], AnimationFrames[0][4]);
        this.walkDown.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
        this.walkRight = new Animation(0.1f, AnimationFrames[1][0], AnimationFrames[1][1], AnimationFrames[1][2], AnimationFrames[1][3], AnimationFrames[1][4]);
        this.walkRight.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
        this.walkUp = new Animation(0.1f, AnimationFrames[2][0], AnimationFrames[2][1], AnimationFrames[2][2], AnimationFrames[2][3], AnimationFrames[2][4]);
        this.walkUp.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
        this.walkLeft = new Animation(0.1f, AnimationFrames[3][0], AnimationFrames[3][1], AnimationFrames[3][2], AnimationFrames[3][3], AnimationFrames[3][4]);
        this.walkLeft.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);            
        this.currentAnimation = this.walkDown;
        this.walking = false;
    }
            
    public void draw(Batch batch, float currentTime){
        if(this.walking){
            batch.draw((TextureRegion) currentAnimation.getKeyFrame(currentTime), positionX, positionY);
        }
        else{
            batch.draw((TextureRegion) currentAnimation.getKeyFrame(0), positionX, positionY);
        }
    }

    public Texture getSpriteSheet() {
        return spriteSheet;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Animation getWalkRight() {
        return walkRight;
    }

    public Animation getWalkLeft() {
        return walkLeft;
    }

    public Animation getWalkUp() {
        return walkUp;
    }

    public Animation getWalkDown() {
        return walkDown;
    }

    public Animation getCurrentAnimation() {
        return currentAnimation;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWalking() {
        return walking;
    }
    
    public void setSpriteSheet(Texture spriteSheet) {
        this.spriteSheet = spriteSheet;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setWalkRight(Animation walkRight) {
        this.walkRight = walkRight;
    }

    public void setWalkLeft(Animation walkLeft) {
        this.walkLeft = walkLeft;
    }

    public void setWalkUp(Animation walkUp) {
        this.walkUp = walkUp;
    }

    public void setWalkDown(Animation walkDown) {
        this.walkDown = walkDown;
    }

    public void setCurrentAnimation(Animation currentAnimation) {
        this.currentAnimation = currentAnimation;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWalking(boolean walking) {
        this.walking = walking;
    }
    
}
