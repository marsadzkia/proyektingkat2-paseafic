package org.d3if2125.paseafic_nav.ui.belajar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if2125.paseafic_nav.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar =  supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val i = this.intent

        val judul = i.extras!!.getString("title")
        val pict = i.extras!!.getInt("gambar")
        val konten = i.extras!!.getString("isi")

        binding.judulbelajar.text = judul
        binding.gambar.setImageResource(pict)
        binding.txt.text = konten
    }

    // nambahin navigation up
    override fun onSupportNavigateUp(): Boolean {
        // untuk kembali
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        // untuk mengakhiri layout/activity
        this.finish()
    }
}