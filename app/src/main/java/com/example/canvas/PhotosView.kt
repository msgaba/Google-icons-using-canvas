package com.example.canvas

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat

/**
 * Created by Ankita
 */
class PhotosView: View {


    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    var paint = Paint().apply {
        color = Color.parseColor("#FF0000")
        strokeWidth = 5F
        style = Paint.Style.FILL
        isAntiAlias = true
    }


    var screenWidth = 0
    var screenHeight = 0

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        /** drawing blue leaf for photos icon **/
        paint.color = ContextCompat.getColor(context, R.color.blue)
        canvas?.drawArc(RectF(screenWidth/2f, screenHeight/2f - 150f, screenWidth/2f + 350f, screenHeight/2f + 150f),180f, -180f, true, paint)
        /** drawing red leaf for photos icon **/
        paint.color = ContextCompat.getColor(context, R.color.red)
        canvas?.drawArc(RectF(screenWidth/2f - 150f, screenHeight/2f - 350f, screenWidth/2f+150f, screenHeight/2f),90f, -180f, true, paint)
        /** drawing yellow leaf for photos icon **/
        paint.color = ContextCompat.getColor(context, R.color.yellow)
        canvas?.drawArc(RectF(screenWidth/2 - 350f, screenHeight/2f - 150f, screenWidth/2f, screenHeight/2f + 150f),0f, -180f, true, paint)
        /** drawing green leaf for photos icon **/
        paint.color = ContextCompat.getColor(context, R.color.green)
        canvas?.drawArc(RectF(screenWidth/2f -150f, screenHeight/2f, screenWidth/2f + 150f,screenHeight/2f + 350f),270f, -180f, true, paint)

    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        screenWidth = w
        screenHeight = h
    }
}