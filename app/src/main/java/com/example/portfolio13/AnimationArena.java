package com.example.portfolio13;

import android.graphics.Canvas;

public class AnimationArena {
    private Ball myBall;

    public AnimationArena() {
        myBall = new Ball();
    }

    //Update location of ball
    public void update(int width, int height) {
        myBall.move(0, 0, width, height);
    }

    public void draw(Canvas canvas) {
        //set the background color for canvas
        canvas.drawRGB(50, 200, 200);

        myBall.draw(canvas);
    }
}
