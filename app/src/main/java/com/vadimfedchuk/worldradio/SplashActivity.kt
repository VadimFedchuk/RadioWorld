package com.vadimfedchuk.worldradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_content_layout.*
import kotlinx.android.synthetic.main.main_fragment.*
import me.zhanghai.android.materialplaypausedrawable.MaterialPlayPauseDrawable
import android.view.View


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_fragment)

        initViews()
    }

    private fun initViews() {
        bottom_bar.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_station -> {

                }
                R.id.action_feedback -> {
                    expandLayout()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

        top_bar.apply {
            cardElevation = 0.0F
            setCardBackgroundColor(resources.getColor(android.R.color.transparent))
            background.alpha = 0
        }

        play_pause_button.setOnClickListener {

                val newState =
                    if (play_pause_button.state === MaterialPlayPauseDrawable.State.Play)
                        MaterialPlayPauseDrawable.State.Pause
                    else
                        MaterialPlayPauseDrawable.State.Play
                play_pause_button.state = newState
            }

    }

    private fun expandLayout() {
//        val bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet)
//        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
//            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
//        } else {
//            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
//        }
    }
}
