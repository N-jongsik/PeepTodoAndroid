package com.peeptodo.peep_todo_android.ui.customview

import android.content.Context
import android.graphics.PorterDuff
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import com.peeptodo.peep_todo_android.R

class CustomCheckBox @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var isChecked = false

    init {
        // 초기화 및 속성 처리
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CustomCheckBox,
            0, 0
        ).apply {
            try {
                // 아이콘 색상과 체크 상태를 설정
                val color = getColor(R.styleable.CustomCheckBox_checkbox_iconColor, ContextCompat.getColor(context, R.color.gray_300))
                isChecked = getBoolean(R.styleable.CustomCheckBox_checkbox_isChecked, false)

                // 색상 설정
                setColorFilter(color, PorterDuff.Mode.SRC_IN)

                // 초기 아이콘 상태 설정
                updateIcon()
            } finally {
                recycle()
            }
        }

        // 클릭 이벤트 처리
        setOnClickListener {
            toggleChecked()
        }
    }

    // 상태 업데이트
    private fun updateIcon() {
        val iconRes = if (isChecked) R.drawable.ic_checked_square else R.drawable.ic_blank_square
        setImageResource(iconRes)
    }

    // 체크 상태 토글
    private fun toggleChecked() {
        setChecked(!isChecked)
    }

    // 외부에서 상태 설정
    fun setChecked(checked: Boolean) {
        if (isChecked != checked){
            isChecked = checked
            updateIcon()
        }
    }

    // 현재 체크 상태 반환
    fun isChecked(): Boolean = isChecked
}