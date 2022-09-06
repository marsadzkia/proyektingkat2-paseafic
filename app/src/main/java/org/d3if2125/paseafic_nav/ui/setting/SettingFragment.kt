@file:Suppress("UNREACHABLE_CODE")

package org.d3if2125.paseafic_nav.ui.setting

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import org.d3if2125.paseafic_nav.databinding.FragmentSettingBinding
import org.d3if2125.paseafic_nav.firebase.LoginActivity

class SettingFragment : Fragment() {

    private lateinit var binding: FragmentSettingBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.cardLogout.setOnClickListener {
            firebaseAuth.signOut()
            Toast.makeText(context, "Sudah berhasil logout.", Toast.LENGTH_SHORT).show()

            startActivity(Intent(context, LoginActivity::class.java))
        }
    }
}