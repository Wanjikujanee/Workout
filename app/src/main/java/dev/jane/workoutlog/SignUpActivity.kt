package dev.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Button
import android.widget.TextView
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import com.google.android.material.textfield.TextInputLayout
import dev.jane.workoutlog.databinding.ActivitySignUpBinding
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding


//    lateinit var tvLogin: TextView
//    lateinit var btnSignUp: Button
//    lateinit var tilEmail: TextInputLayout
//    lateinit var tilfirstName: TextInputLayout
//    lateinit var tilPassword: TextInputLayout
//    lateinit var tillastName: TextInputLayout
//    lateinit var tilconfirm: TextInputLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        tvLogin=findViewById(R.id.tvSignUp)
//        btnSignUp=findViewById(R.id.btnSignUp)
//        tillastName=findViewById(R.id.tillastName)
//        tilconfirm=findViewById(R.id.tilconfirm)
//        tilEmail=findViewById(R.id.tilEmail)
//        tilfirstName=findViewById(R.id.tilfirstName)
//        tilPassword=findViewById(R.id.tilPassword)


        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        binding.btnSignUp.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
           invalidateSignUp()
        }
    }

    fun invalidateSignUp() {
        var firstname=binding.tilfirstName.editText.toString()
        var lastname=binding.tillastName.editText.toString()
        var confirm=binding.tilconfirm.editText.toString()
        var email=binding.itemail.text.toString()
        var password=binding.itpassword.text.toString()


        if(firstname.isBlank()){
            binding.itfirstName.error="Email is invalid"
        }
        if (lastname.isBlank()){
            binding.itfirstName.error="Password is required"
        }
        binding.itemail.error=null

        if(email.isBlank()){
            binding.itemail.error="email is invalid"
        }
        if (password.isBlank()){
            binding.itpassword.error="password is required"
        }
        if (confirm.isBlank()){
            binding.itConfirm.error="Password is required"
        }
        if (binding.itpassword!=binding.tilconfirm){
            binding.tilconfirm.error="error"


        }



    }
}