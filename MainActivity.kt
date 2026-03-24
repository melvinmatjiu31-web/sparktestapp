package com.example.sparktestapp
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeinput)
        val suggestButton = findViewById<Button>(R.id.suggestbutton)
        val resultText = findViewById<TextView>(R.id.resulttext)
        val resetButton = findViewById<Button>(R.id.resetbutton2)

        suggestButton.setOnClickListener {
            val userInput = timeInput.text.toString().lowercase().trim()

            val result = when (userInput) {
                "morning" -> "Go for a walk or grab coffee "
                "afternoon" -> "Meet a friend or study together "
                "evening" -> "Watch a movie or relax "
                "breakfast" -> "Try a new café "
                "lunch" -> "Eat out or order something tasty "
                "dinner" -> "Cook or dine with friends "
                else -> "Please enter a valid option!"
            }

            resultText.text = result
        }

        resetButton.setOnClickListener {
            timeInput.text.clear()
            resultText.text = ""
        }
    }

}
