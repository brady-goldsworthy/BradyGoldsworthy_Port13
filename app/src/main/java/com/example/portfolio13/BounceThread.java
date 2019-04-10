package com.example.portfolio13;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class BounceThread extends Thread{
    private SurfaceHolder surfaceHolder;

    private AnimationArena animationArena;

    private boolean isRunning;

    public BounceThread(SurfaceHolder sh) {
        surfaceHolder = sh;

        isRunning = true;

        animationArena = new AnimationArena();

    }

    public void run() {
        try {
            while (isRunning) {
                //Create a canvas and lock it
                Canvas canvas = surfaceHolder.lockCanvas();

                animationArena.update(canvas.getWidth(), canvas.getHeight());
                animationArena.draw(canvas);
                
                surfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
        catch (NullPointerException npe) {
            npe.printStackTrace();

        }
    }

    public void endBounce() {
        isRunning = false;
    }

}
