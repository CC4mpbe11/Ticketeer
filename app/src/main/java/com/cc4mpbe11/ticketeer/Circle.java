package com.cc4mpbe11.ticketeer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

// Circle extends LottoGameObject

public abstract class Circle extends LottoGameObject {

    protected double radius;
    protected Paint paint;

    public Circle(Context context, int color, double positionX, double positionY, double radius) {
        super(positionX, positionY);

        this.radius = radius;

        // Sets color of circle
        paint = new Paint();
        paint.setColor(color);
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle((float) positionX, (float) positionY, (float) radius, paint);
    }
}
