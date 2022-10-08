package com.example.canvas

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat

/**
 * Created by Ankita
 */
class GmailView: View {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr)

    private var paint = Paint().apply {
        color = ContextCompat.getColor(context, R.color.blue)
        strokeWidth = 5F
        style = Paint.Style.FILL
        isAntiAlias = true
    }

    var pathBlue = Path()
    var pathDarkRed = Path()
    var pathRed = Path()
    var pathYellow = Path()
    var pathGreen = Path()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        /** drawing blue part for gmail icon **/
        paint.color = ContextCompat.getColor(context, R.color.blue)
        pathBlue.moveTo(100f, 400f)
        pathBlue.lineTo(30f, 400f)
        pathBlue.addArc(RectF(0f,370f,30f,400f),90f,80f)
        pathBlue.lineTo(0f, 100f)
        pathBlue.lineTo(100f, 175f)
        pathBlue.lineTo(100f, 400f)
        pathBlue.close()
        canvas?.drawPath(pathBlue, paint)
        /** drawing dark red part for gmail icon **/
        paint.color = ContextCompat.getColor(context, R.color.dark_red)
        pathDarkRed.moveTo(0f,100f)
        pathDarkRed.lineTo(0f,75f)
        pathDarkRed.addArc(RectF(0f,0f,80f,75f),180f,120f)
        pathDarkRed.lineTo(100f,37.5f)
        pathDarkRed.lineTo(100f,175f)
        pathDarkRed.lineTo(0f,100f)
        pathBlue.close()
        canvas?.drawPath(pathDarkRed, paint)
        /** drawing red part for gmail icon **/
        paint.color = ContextCompat.getColor(context, R.color.red)
        pathRed.moveTo(100f,37.5f)
        pathRed.lineTo(300f,187.5f)
        pathRed.lineTo(500f,37.5f)
        pathRed.lineTo(500f,175f)
        pathRed.lineTo(300f,325f)
        pathRed.lineTo(100f,175f)
        pathRed.lineTo(100f,25f)
        pathRed.close()
        canvas?.drawPath(pathRed, paint)
        /** drawing yellow part for gmail icon **/
        paint.color = ContextCompat.getColor(context, R.color.yellow)
        pathYellow.moveTo(600f,100f)
        pathYellow.lineTo(600f,75f)
        pathYellow.addArc(RectF(520f,0f,600f,75f),0f,-120f)
        pathYellow.lineTo(500f,37.5f)
        pathYellow.lineTo(500f,175f)
        pathYellow.lineTo(600f,100f)
        pathYellow.close()
        canvas?.drawPath(pathYellow, paint)
        /** drawing green part for gmail icon **/
        paint.color = ContextCompat.getColor(context, R.color.green)
        pathGreen.moveTo(500f, 400f)
        pathGreen.lineTo(570f, 400f)
        pathGreen.addArc(RectF(570f,370f,600f,400f),90f,-80f)
        pathGreen.lineTo(600f, 100f)
        pathGreen.lineTo(500f, 175f)
        pathGreen.lineTo(500f, 400f)
        pathGreen.close()
        canvas?.drawPath(pathGreen, paint)

    }
}