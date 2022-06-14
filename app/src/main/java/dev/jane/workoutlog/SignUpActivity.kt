package dev.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Button
import android.widget.TextView
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    lateinit var tvLogin: TextView
    lateinit var btnSignUp: Button
    lateinit var tilEmail: TextInputLayout
    lateinit var tilfirstName: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var tillastName: TextInputLayout
    lateinit var tilconfirm: TextInputLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        tvLogin=findViewById(R.id.tvSignUp)
        btnSignUp=findViewById(R.id.btnSignUp)
        tillastName=findViewById(R.id.tillastName)
        tilconfirm=findViewById(R.id.tilconfirm)
        tilEmail=findViewById(R.id.tilEmail)
        tilfirstName=findViewById(R.id.tilfirstName)
        tilPassword=findViewById(R.id.tilPassword)


        tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

        btnSignUp.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
           invalidateSignUp()
        }
    }

    fun invalidateSignUp() {
        var firstname=tilfirstName.editText.toString()
        var lastname=tillastName.editText.toString()
        var email=tilEmail.editText.toString()
        var password=tilPassword.editText.toString()
        var confirm=tilconfirm.editText.toString()

        if(firstname.isBlank()){
            tilfirstName.error="Email is invalid"
        }
        if (lastname.isBlank()){
            tillastName.error="Password is required"
        }
        tilEmail.error=null

        if(email.isBlank()){
            tilEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            tilPassword.error="Password is required"
        }
        if (confirm.isBlank()){
            tilconfirm.error="Password is required"
        }
        if (tilPassword!=tilconfirm){
            tilconfirm.error="error"


        }
//        if(!Pattern.EMAIL_ADDRESS.matcher(email).matches()){
//            tilEmail.error="Email is invalid"
//        }



    }
}