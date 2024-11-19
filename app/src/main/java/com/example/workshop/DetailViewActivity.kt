package com.example.workshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.workshop.databinding.ActivityDetailViewBinding

class DetailViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout using ViewBinding
        binding = ActivityDetailViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve data from the intent
        val morningRuns = intent.getFloatArrayExtra("morningRuns") ?: floatArrayOf()
        val afternoonRuns = intent.getFloatArrayExtra("afternoonRuns") ?: floatArrayOf()
        val notes = intent.getStringArrayExtra("notes") ?: arrayOf()

        // Build details string
        val details = StringBuilder()
        for (i in morningRuns.indices) {
            details.append("Day ${i + 1}:\n")
            details.append("Morning Run: ${morningRuns[i]} km\n")
            details.append("Afternoon Run: ${afternoonRuns[i]} km\n")
            details.append("Notes: ${notes[i]}\n\n")
        }

        // Update the TextView and set button listener
        binding.txtDetails.text = details.toString()
        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
