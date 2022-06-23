package dev.jane.workoutlog

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputLayout
import dev.jane.workoutlog.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
//    lateinit var bnvHome:BottomNavigationView
//    lateinit var fcvHome:FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        castViews()
        setupBottomNav()
    }
    fun castViews(){
//        bnvHome=findViewById(R.id.bottonnavigation)
//        fcvHome=findViewById(R.id.fcvHome)

    }
    fun setupBottomNav(){
        binding.bottonnavigation.setOnItemSelectedListener{ item->
            when(item.itemId){
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,PlanFragment()).commit()
                true
                }
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true
                }
                else-> false


            }
        }

    }
}