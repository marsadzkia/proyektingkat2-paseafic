package org.d3if2125.paseafic_nav.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2125.paseafic_nav.databinding.ActivityHomeDetailBinding

class HomeDetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar =  supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val i = this.intent

        val judul = i.extras!!.getString("title")
        val pict = i.extras!!.getInt("gambar")
        val konten = i.extras!!.getString("isi")

        binding.judulFakta.text = judul
        binding.gambarFakta.setImageResource(pict)
        binding.txtFakta.text = konten
    }
}