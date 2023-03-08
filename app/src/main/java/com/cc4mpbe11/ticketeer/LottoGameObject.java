package com.cc4mpbe11.ticketeer;

import android.graphics.Canvas;

// Foundation class for all objects in the game

public abstract class LottoGameObject {
    protected double positionX;
    protected double positionY;
    protected double velocityX;
    protected double velocityY;

    public LottoGameObject(double positionX, double positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public abstract void draw(Canvas canvas);

    public abstract void update();
}
