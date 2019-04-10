package com.example.portfolio13;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class BounceSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    private BounceThread bounceThread;

    public BounceSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        //Create a surface holder
        SurfaceHolder surfaceHolder = getHolder();

        surfaceHolder.addCallback(this);

        //Attach surface holder to the bounce thread
        bounceThread = new BounceThread(surfaceHolder);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        //Start thread
        bounceThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        //Stub
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        bounceThread.endBounce(); //end animation so that thread stops executing

        //Strange behavior needed to nullify thread
        Thread dummyThread = bounceThread; //create dummy thread to hold thread you want to nullify
        bounceThread = null; //nullify actual thread
        dummyThread.interrupt(); //the nullify dummy thread

    }
}
