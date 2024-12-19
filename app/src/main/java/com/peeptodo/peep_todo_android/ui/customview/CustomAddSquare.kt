package com.peeptodo.peep_todo_android.ui.customview

import android.content.Context
import android.graphics.PorterDuff
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import com.peeptodo.peep_todo_android.R

class CustomAddSquare @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {
    init {
        // 초기화 및 속성 처리
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomAddSquare,
            0, 0
        ).apply {
            try {
                // 아이콘 색상과 체크 상태를 설정
                val color = getColor(
                    R.styleable.CustomAddSquare_addSquare_color,
                    ContextCompat.getColor(context, R.color.gray_300)
                )

                // 색상 설정
                setColorFilter(color, PorterDuff.Mode.SRC_IN)
                setImageResource(R.drawable.ic_add_square_fill)

            } finally {
                recycle()
            }
        }
    }
}