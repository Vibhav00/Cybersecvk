package com.example.cybersecvk

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.constraintlayout.motion.widget.OnSwipe
import androidx.core.content.ContextCompat
import com.example.cybersecvk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null;
    private var Elements: ArrayList<Element>? = null
    lateinit var animation: Animation
    lateinit var animationdesc:Animation
    private var i: Int = 0;

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }

        //***********************************************
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

            val attrib = window.attributes
            attrib.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        }
        Elements = ElementList.getElement()
        i = 0;
        setView(i)
        val layout = binding?.root
        layout?.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                rightSet()
            }

            override fun onSwipeRight() {
                super.onSwipeRight()
                leftSet()
            }
        })

    }


    fun rightSet() {
        if (i == 6)
            Toast.makeText(this@MainActivity, "right most ", Toast.LENGTH_SHORT).show()
        else {

            animationset(0)
            setView(++i)
        }

    }

    fun leftSet() {
        if (i == 0)
            Toast.makeText(this@MainActivity, "left most ", Toast.LENGTH_SHORT).show()
        else {
            animationset(1)
            setView(--i)
        }

    }

    fun setView(i: Int) {
        if (Elements != null) {
            binding?.iv?.setImageResource(Elements!![i].image)
            binding?.tv?.text = Elements!![i].stat
            binding?.tvd?.text=Elements!![i].desc
            setDot(i)
        }
    }

    fun animationset(i: Int) {

        if (i == 1)
            animation = AnimationUtils.loadAnimation(this, R.anim.right_swip)
        else
            animation = AnimationUtils.loadAnimation(this, R.anim.left_swip)
        animationdesc=AnimationUtils.loadAnimation(this,R.anim.textdesc)
        binding?.iv?.startAnimation(animation)
        binding?.tv?.startAnimation(animation)
        binding?.tvd?.startAnimation(animationdesc)

    }

    fun setDot(i: Int) {

        binding?.dot1?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot2?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot3?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot4?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot5?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot6?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)
        binding?.dot7?.background = ContextCompat.getDrawable(this@MainActivity, R.drawable.dot)

        if (i == 0) {
            binding?.dot1?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)
        }
        if (i == 1) {
            binding?.dot2?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)
        }
        if (i == 2) {
            binding?.dot3?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)

        }


        if (i == 3) {
            binding?.dot4?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)

        }



        if (i == 4) {
            binding?.dot5?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)

        }
        if (i == 5) {
            binding?.dot6?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)

        }

        if (i == 6) {
            binding?.dot7?.background =
                ContextCompat.getDrawable(this@MainActivity, R.drawable.dot_selected)

        }


    }
}