package com.example.dice2

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.dice2.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.bind(findViewById(R.id.root))

        binding.rollButton.text = "Let's roll"

        binding.rollButton.setOnClickListener {
//            Toast.makeText(
//                this,
//                "button clicked",
//                Toast.LENGTH_SHORT
//                ).show()
            rollDice()
        }

        diceImage = binding.diceImage
    }

    fun rollDice(){
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}