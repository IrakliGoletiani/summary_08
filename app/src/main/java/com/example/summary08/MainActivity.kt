package com.example.summary08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.summary08.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    val firstEnteredPasscode = arrayListOf<Int>()
    val secondEnteredPasscode = arrayListOf<Int>()

    lateinit var specificCollection: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.ibNumber0.setOnClickListener(this)
        binding.ibNumber1.setOnClickListener(this)
        binding.ibNumber2.setOnClickListener(this)
        binding.ibNumber3.setOnClickListener(this)
        binding.ibNumber4.setOnClickListener(this)
        binding.ibNumber5.setOnClickListener(this)
        binding.ibNumber6.setOnClickListener(this)
        binding.ibNumber7.setOnClickListener(this)
        binding.ibNumber8.setOnClickListener(this)
        binding.ibNumber9.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        specificCollection =
            if (firstEnteredPasscode.size != 4) firstEnteredPasscode else secondEnteredPasscode

        when (v!!.id) {
            R.id.ibNumber0 -> {
                specificCollection.add(0)
                setBackgroundGreen()
            }
            R.id.ibNumber1 -> {
                specificCollection.add(1)
                setBackgroundGreen()
            }
            R.id.ibNumber2 -> {
                specificCollection.add(2)
                setBackgroundGreen()
            }
            R.id.ibNumber3 -> {
                specificCollection.add(3)
                setBackgroundGreen()
            }
            R.id.ibNumber4 -> {
                specificCollection.add(4)
                setBackgroundGreen()
            }
            R.id.ibNumber5 -> {
                specificCollection.add(5)
                setBackgroundGreen()
            }
            R.id.ibNumber6 -> {
                specificCollection.add(6)
                setBackgroundGreen()
            }
            R.id.ibNumber7 -> {
                specificCollection.add(7)
                setBackgroundGreen()
            }
            R.id.ibNumber8 -> {
                specificCollection.add(8)
                setBackgroundGreen()
            }
            R.id.ibNumber9 -> {
                specificCollection.add(9)
                setBackgroundGreen()
            }
        }
    }

    private fun setBackgroundGreen() {
        val checkSize =
            if (firstEnteredPasscode.size != 4) firstEnteredPasscode.size else secondEnteredPasscode.size

        when (checkSize) {
            0 -> {
                binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse)
            }
            1 -> {
                binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse)
            }
            2 -> {
                binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse)
                binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse)
            }
            3 -> {
                binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse)
            }
            4 -> {
                binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse_success)
                binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse_success)

                if (firstEnteredPasscode == secondEnteredPasscode) {
                    Snackbar.make(binding.root, "Passcode Is Correct", Snackbar.LENGTH_LONG).show()
                    reset()
                } else {
                    Snackbar.make(binding.root, "Passcode Is Not Correct", Snackbar.LENGTH_LONG).show()
                    reset()
                }

            }
        }
    }

    private fun reset(){
        firstEnteredPasscode.clear()
        secondEnteredPasscode.clear()

        binding.ibPasscode1.setBackgroundResource(R.drawable.background_ellipse)
        binding.ibPasscode2.setBackgroundResource(R.drawable.background_ellipse)
        binding.ibPasscode3.setBackgroundResource(R.drawable.background_ellipse)
        binding.ibPasscode4.setBackgroundResource(R.drawable.background_ellipse)
    }
}