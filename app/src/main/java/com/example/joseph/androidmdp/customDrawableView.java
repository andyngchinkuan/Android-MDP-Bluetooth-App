package com.softwareengineering.johnathan.drawable;

/**
 * Created by Johnathan on 2/9/2018.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

public class CustomDrawableView extends View {

    private int x,y,width,height,space;
    private ShapeDrawable[][] shapes = new ShapeDrawable[20][16];
    //private ShapeDrawable shapes;

    public CustomDrawableView(Context context, int x, int y, int width, int height,int space) {
        super(context);

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.space = space;

        for(int i=0;i<20;i++){
            if(i==0)
                y=10;
            else
                y+=height+space;

            for(int j=0;j<16;j++){
                shapes[i][j] = new ShapeDrawable(new RectShape());
                shapes[i][j].getPaint().setColor(Color.rgb(255,000,000));
                if(j==0)
                    x=10;
                else
                    x+=width+space;
                shapes[i][j].setBounds(x, y, x+width, y + height);
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        for(int i=0;i<20;i++){
            for(int j=0;j<16;j++){
                shapes[i][j].draw(canvas);
            }
        }
    }
}
