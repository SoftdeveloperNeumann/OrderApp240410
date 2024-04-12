package com.example.orderapp240410.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.orderapp240410.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // nicht vergessen die ParentActivity in der Manifest-Datei anzugeben
        setSupportActionBar(binding.toolbar2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.tvDetail.text = intent.getStringExtra("name")
//        binding.ivDetail.setImageDrawable(resources.getDrawable(intent.getIntExtra("image",0))) // so war es bisher
        binding.ivDetail.setImageDrawable(ResourcesCompat.getDrawable(resources,intent.getIntExtra("image",0),null))
    }
}