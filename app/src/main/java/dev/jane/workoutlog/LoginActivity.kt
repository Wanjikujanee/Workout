package dev.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.jane.workoutlog.databinding.ActivityLoginBinding
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

//    lateinit var tvSignUp:TextView
//    lateinit var tilEmail:TextInputLayout
//    lateinit var tilPassword: TextInputLayout
//    lateinit var btnLogin:Button
//    lateinit var etTextView:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        tvSignUp=findViewById(R.id.tvSignUp)
//        tilEmail=findViewById(R.id.tilEmail)
//        etTextView=findViewById(R.id.etTextView)
//        tilPassword=findViewById(R.id.tilPassword)
//        btnLogin=findViewById(R.id.btnLogin)





        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }
        binding.btnLogin.setOnClickListener{
            validateLogin()
        }
    }

    fun validateLogin() {
        var email=binding.tilEmail.editText.toString()
        var password=binding.tilPassword.editText.toString()
        if(email.isBlank()){
            binding.tilEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            binding.tilPassword.error="Password is required"
        }
    }
}
