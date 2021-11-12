package com.example.question2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // elements refs
        val maleBtn = findViewById<RadioButton>(R.id.maleButton);
        val femaleBtn = findViewById<RadioButton>(R.id.femaleButton);
        val tncCheckBox = findViewById<CheckBox>(R.id.tnc);
        val clickMeBtn = findViewById<Button>(R.id.clickMe);

        //click handlers
        maleBtn.setOnClickListener{
            Toast.makeText(this, "You are a male.", Toast.LENGTH_SHORT).show();
        }
        femaleBtn.setOnClickListener{
            Toast.makeText(this, "You are a female.", Toast.LENGTH_SHORT).show();
        }
        tncCheckBox.setOnClickListener{
            if (tncCheckBox.isChecked()){
                Toast.makeText(this, "T&C Agreed.", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "T&C Disagreed.", Toast.LENGTH_SHORT).show();
            }
        }
        clickMeBtn.setOnClickListener{
            Toast.makeText(this, "${findViewById<EditText>(R.id.nameInput).text.toString()} has clicked me!", Toast.LENGTH_LONG).show();
        }
    }
}