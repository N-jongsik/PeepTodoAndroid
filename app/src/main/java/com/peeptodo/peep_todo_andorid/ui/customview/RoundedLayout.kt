package com.peeptodo.peep_todo_andorid.ui.customview

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.peeptodo.peep_todo_andorid.R

class RoundedLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private val backgroundDrawable : GradientDrawable
    init {
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.RoundedLayout)

        // 속성 가져오기
        val borderColor = attributes.getColor(R.styleable.RoundedLayout_roundedLayout_borderColor,
            ContextCompat.getColor(context, R.color.gray_300))
        val backgroundColor = attributes.getColor(R.styleable.RoundedLayout_roundedLayout_backgroundColor,
            ContextCompat.getColor(context, android.R.color.transparent)) // 기본값: 투명

        backgroundDrawable = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            setColor(backgroundColor)
            setStroke(2, borderColor)
            cornerRadius = 40f
        }


        background = backgroundDrawable

        val defaultPadding = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            10f,
            resources.displayMetrics
        ).toInt()
        setPadding(defaultPadding, defaultPadding, defaultPadding, defaultPadding)

        attributes.recycle()
    }

}