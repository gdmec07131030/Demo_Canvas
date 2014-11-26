package com.example.demo_canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawColor(Color.GRAY);
		Paint paint=new Paint();
		paint.setColor(Color.BLACK);
		canvas.drawCircle(100, 100, 50, paint);
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(10);
		canvas.drawRect(new RectF(200, 200, 300, 300), paint);
		paint.setColor(Color.BLUE);
		canvas.drawText("liuzhiyi", 300, 300, paint);
		paint.setTextSize(40);
	}

	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

}
