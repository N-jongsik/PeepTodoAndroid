package com.peeptodo.peep_todo_android.ui.customview

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.peeptodo.peep_todo_android.R

class SmallIconButtonTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): LinearLayout(context, attrs, defStyleAttr) {
    private val imageView: ImageView
    private val textView: TextView

    init {
        // Layout 초기화
        orientation = HORIZONTAL
        setPadding(16, 16, 16, 16)

        // Inflate Custom View
        inflate(context, R.layout.view_small_icon_button_textview, this)
        imageView = findViewById(R.id.icon)
        textView = findViewById(R.id.text)

        // Attributes 가져오기
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.SmallIconButtonTextView)

            // 테두리 색
            val borderColor = typedArray.getColor(
                R.styleable.SmallIconButtonTextView_SmalliconButton_borderColor,
                ContextCompat.getColor(context, R.color.gray_300)
            )
            val backgroundColor = typedArray.getColor(
                R.styleable.SmallIconButtonTextView_SmalliconButton_backgroundColor,
                ContextCompat.getColor(context, android.R.color.transparent)
            )
            val iconTint = typedArray.getColor(
                R.styleable.SmallIconButtonTextView_SmalliconButton_iconTint,
                ContextCompat.getColor(context, R.color.gray_600)
            )
            val text = typedArray.getString(R.styleable.SmallIconButtonTextView_SmalliconButton_text) ?: ""
            val textTint = typedArray.getColor(R.styleable.SmallIconButtonTextView_SmalliconButton_textTint, ContextCompat.getColor(context,R.color.gray_600))
            val iconSrc = typedArray.getResourceId(
                R.styleable.SmallIconButtonTextView_SmalliconButton_iconSrc,
                android.R.drawable.ic_menu_help
            )

            // 적용
            setBorderColorAndBackground(borderColor, backgroundColor)
            setIcon(iconSrc, iconTint)
            setText(text, textTint)

            typedArray.recycle()
        }


    }

    fun setBorderColorAndBackground(borderColor: Int, backgroundColor: Int) {
        val drawable = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = 50f
            setStroke(2, borderColor)
            setColor(backgroundColor)
        }
        background = drawable
    }

    fun setIcon(iconRes: Int, tintColor: Int) {
        imageView.setImageResource(iconRes)
        imageView.setColorFilter(tintColor)
    }

    fun setText(text: String, textTint: Int) {
        textView.text = text
        textView.setTextColor(textTint)
    }
}