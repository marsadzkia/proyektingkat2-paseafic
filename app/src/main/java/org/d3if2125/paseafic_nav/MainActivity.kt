package org.d3if2125.paseafic_nav

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import org.d3if2125.paseafic_nav.ui.belajar.BelajarFragment
import org.d3if2125.paseafic_nav.ui.home.HomeFragment
import org.d3if2125.paseafic_nav.ui.setting.SettingFragment

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val belajarFragment = BelajarFragment()
    private val settingFragment = SettingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        moveFragment(homeFragment)

        bottom_Nav.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home -> moveFragment(homeFragment)
                R.id.ic_book -> moveFragment(belajarFragment)
                R.id.ic_setting -> moveFragment(settingFragment)
            }
            true
        }
    }

    private fun moveFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}