package com.example.workshop

//list of imports
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.workshop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Arrays to store running data
    private val morningRuns = mutableListOf<Float>()
    private val afternoonRuns = mutableListOf<Float>()
    private val notes = mutableListOf<String>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up event listeners using binding
        binding.btnSubmit.setOnClickListener {
            val morningRun = binding.edtMorningRun.text.toString().toFloatOrNull()
            val afternoonRun = binding.edtAfternoonRun.text.toString().toFloatOrNull()
            val note = binding.edtNote.text.toString()

            if (morningRun == null || afternoonRun == null || note.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            } else {
                morningRuns.add(morningRun)
                afternoonRuns.add(afternoonRun)
                notes.add(note)
                Toast.makeText(this, "Data Saved!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnClear.setOnClickListener {
            binding.edtMorningRun.text.clear()
            binding.edtAfternoonRun.text.clear()
            binding.edtNote.text.clear()
        }

        binding.btnCalculateAverage.setOnClickListener {
            if (morningRuns.isEmpty() || afternoonRuns.isEmpty()) {
                Toast.makeText(this, "No data available!", Toast.LENGTH_SHORT).show()
            } else {
                val totalDistance = morningRuns.sum() + afternoonRuns.sum()
                val averageDistance = totalDistance / (morningRuns.size + afternoonRuns.size)
                binding.txtAverage.text = "Average Distance: ${"%.2f".format(averageDistance)} km"
            }
        }

        binding.btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailViewActivity::class.java)
            intent.putExtra("morningRuns", morningRuns.toFloatArray())
            intent.putExtra("afternoonRuns", afternoonRuns.toFloatArray())
            intent.putExtra("notes", notes.toTypedArray())
            startActivity(intent)
        }
    }
}
