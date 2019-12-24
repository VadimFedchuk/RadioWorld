package com.vadimfedchuk.worldradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.cardview.widget.CardView
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.bottom_sheet_layout.*
import kotlinx.android.synthetic.main.main_content_layout.*
import kotlinx.android.synthetic.main.main_fragment.*
import java.security.AccessController.getContext


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
                R.id.action_more -> {
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
    }

    private fun expandLayout() {
        val bottomSheetBehavior = BottomSheetBehavior.from(bottom_sheet)
        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
        } else {
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
        }
    }
}
