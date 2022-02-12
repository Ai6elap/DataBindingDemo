package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // To use a data binding, need to create an object
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(activity: this, R.layout.activity_main)

        val s:Student = Student("W123456", "abu")
        binding.student = s

        binding.btnUpdate.setOnClickListener(){
            s.name = "Alex"

            binding.apply {
                invalidateAll()
            }

        //val s2:Student = Student("W654321", "abu")

        //binding.tvStudentName.text = "Ali"
        //binding.tvStudentID.text = "W123456"

        //binding.tvStudentName.text = "s.name"
        //binding.tvStudentID.text = "s.id"

        // val tvName:TextView = findViewById(R.id.tvStudentName)
        // tvName.text = "Ali"

        }
    }
}