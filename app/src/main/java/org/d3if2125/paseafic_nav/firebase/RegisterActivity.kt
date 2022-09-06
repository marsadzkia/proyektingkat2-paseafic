@file:Suppress("DEPRECATION")

package org.d3if2125.paseafic_nav.firebase

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import org.d3if2125.paseafic_nav.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var progressDialog: ProgressDialog
    private var email = " "
    private var nama = " "
    private var password = " "
    private var confirmpass = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.linktoLogin.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.regisButton.setOnClickListener { regisUser() }

    }

    fun regisUser() {
        email = binding.emailEditText.text.toString()
        nama = binding.namaEditText.text.toString()
        password = binding.passwEditText.text.toString()
        confirmpass = binding.confirmpassEtextr.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty() && confirmpass.isNotEmpty() ) {
            if (password == confirmpass) {
                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Sudah berhasil register.", Toast.LENGTH_SHORT).show()

                        val i = Intent(this, LoginActivity::class.java)
                        startActivity(i)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Password tidak sama.", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Ada kekosongan yang belum diisi.", Toast.LENGTH_SHORT).show()
        }
    }
}